import java.io.IOException;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

/**
 * @author Sami Cemek
 * @version November 16 2022
 * This file creates graphs for each sorting algorithm on a one graph.
 */

public class XChartDemoAll implements ExampleChart<XYChart> {

    public static void main(String[] args) {
  
      ExampleChart<XYChart> exampleChart = new XChartDemoAll();
      XYChart chart = exampleChart.getChart();
      new SwingWrapper<XYChart>(chart).displayChart();
    }
  
    @Override
    public XYChart getChart() {
  
        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).title(getClass().getSimpleName()).xAxisTitle("n(number of items in the array)").yAxisTitle("Runtime in Milliseconds").build();
  
        // Customize Chart
        chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
        chart.getStyler().setPlotMargin(0);
        chart.getStyler().setPlotContentSize(.95);

        // Series
	    double[] xData = new double[] { 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
	    double[] y1Data = new double[] { 1.3525, 0.013, 0.07959, 0.0939, 0.2322, 0.15, 0.2878, 1.97009, 4.5634, 1.4191 };
	    double[] y2Data = new double[] { 0.0026, 0.0047, 0.0978, 0.2251, 0.6138, 4.0302, 3.6751, 40.659, 36.117, 148.48 };
		double[] y3Data = new double[] { 0.0024, 0.0112, 0.131, 0.2357, 0.9026, 2.7263, 10.4116, 28.565, 38.439, 157.62 };
		double[] y4Data = new double[] { 0.0023, 0.00639, 0.0857, 0.3415, 1.1263, 4.1587, 4.7951, 26.965, 78.207, 326.48 };

        chart.setTitle("Run Time of All Sorting Algorithms");
        chart.addSeries("MergeSort", xData, y1Data);
        chart.addSeries("IntersionSort", xData, y2Data);
        chart.addSeries("SelectionSort", xData, y3Data);
        chart.addSeries("BubbleSort", xData, y4Data);

        try {
            BitmapEncoder.saveBitmap(chart, "AllSortingAlgorithms", BitmapFormat.JPG);
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println("AllSortingAlgorithms.jpg created");
  
        return chart;
    }

    @Override
    public String getExampleChartName() {
        return null;
    }
  
  }
