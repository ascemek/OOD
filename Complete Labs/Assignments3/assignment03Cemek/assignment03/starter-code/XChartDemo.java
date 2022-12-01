import java.io.IOException;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.style.markers.SeriesMarkers;

/**
 * @author Sami Cemek
 * @version November 16 2022
 * This file creates graphs for each sorting algorithm separately.
 */

public class XChartDemo {

	// Create a graph for the MergeSort
	public static void makeMergeSortGraph() throws IOException{
		double[] xData = new double[] { 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
		double[] yData = new double[] { 1.3525, 0.013, 0.07959, 0.0939, 0.2322, 0.15, 0.2878, 1.97009, 4.5634, 1.4191 };
	 
		// Create Chart
		XYChart chart = new XYChart(500, 400);
		chart.setTitle("mergeSort Algorithm's Run Times");
		chart.setXAxisTitle("n(number of items in the array)");
		chart.setYAxisTitle("Runtime in Milliseconds");
		XYSeries series = chart.addSeries("y(x)", xData, yData);
		series.setMarker(SeriesMarkers.CIRCLE);
	 
		BitmapEncoder.saveBitmap(chart, "mergeSortOutput", BitmapFormat.JPG);
		System.out.println("mergeSortOutput.jpg created");

	}

	// Create a graph for the IntersionSort
	public static void makeIntersionSortGraph() throws IOException{
		double[] xData = new double[] { 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
		double[] yData = new double[] { 0.0026, 0.0047, 0.0978, 0.2251, 0.6138, 4.0302, 3.6751, 40.659, 36.117, 148.48 };
	 
		// Create Chart
		XYChart chart = new XYChart(500, 400);
		chart.setTitle("intersionSort Algorithm's Run Times");
		chart.setXAxisTitle("n(number of items in the array)");
		chart.setYAxisTitle("Runtime in Milliseconds");
		XYSeries series = chart.addSeries("y(x)", xData, yData);
		series.setMarker(SeriesMarkers.CIRCLE);
	 
		BitmapEncoder.saveBitmap(chart, "intersionSortOutput", BitmapFormat.JPG);
		System.out.println("intersionSortOutput.jpg created");
	}

	// Create a graph for the SelectionSort
	public static void makeSelectionSortGraph() throws IOException{
		double[] xData = new double[] { 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
		double[] yData = new double[] { 0.0024, 0.0112, 0.131, 0.2357, 0.9026, 2.7263, 10.4116, 28.565, 38.439, 157.62 };
	 
		// Create Chart
		XYChart chart = new XYChart(500, 400);
		chart.setTitle("selectionSort Algorithm's Run Times");
		chart.setXAxisTitle("n(number of items in the array)");
		chart.setYAxisTitle("Runtime in Milliseconds");
		XYSeries series = chart.addSeries("y(x)", xData, yData);
		series.setMarker(SeriesMarkers.CIRCLE);
	 
		BitmapEncoder.saveBitmap(chart, "selectionSortOutput", BitmapFormat.JPG);
		System.out.println("selectionSortOutput.jpg created");
	}

	// Create a graph for the BubbleSort
	public static void makeBubbleSortGraph() throws IOException{
		double[] xData = new double[] { 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
		double[] yData = new double[] { 0.0023, 0.00639, 0.0857, 0.3415, 1.1263, 4.1587, 4.7951, 26.965, 78.207, 326.48 };
	 
		// Create Chart
		XYChart chart = new XYChart(500, 400);
		chart.setTitle("bubbleSort Algorithm's Run Times");
		chart.setXAxisTitle("n(number of items in the array)");
		chart.setYAxisTitle("Runtime in Milliseconds");
		XYSeries series = chart.addSeries("y(x)", xData, yData);
		series.setMarker(SeriesMarkers.CIRCLE);
	 
		BitmapEncoder.saveBitmap(chart, "bubbleSortOutput", BitmapFormat.JPG);
		System.out.println("bubbleSortOutput.jpg created");
	}

	
	public static void main(String[] args) throws Exception {

		// Call the methods
		makeMergeSortGraph();
		makeIntersionSortGraph();
		makeSelectionSortGraph();
		makeBubbleSortGraph();

	}
	

}
