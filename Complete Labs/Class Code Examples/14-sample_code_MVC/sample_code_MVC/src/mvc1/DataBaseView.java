package mvc1;

import java.awt.event.ActionListener;
import javax.swing.*; 

public class DataBaseView extends JFrame{

	private JLabel initialMessage;
	private JTextField takeQuery;
	private JButton showResult;
	
	public DataBaseView()
	{
		// this frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200, 600);

		
		initialMessage = new JLabel("<html>Type <b>all</b> to get all the students information,<br>"
				+ "or Type <b>id: an id</b> to get the name of the student<br>"
				+ "or Type <b>name: a name</b> to get the id of the student</html>");
		
		takeQuery = new JTextField(20);
		
		showResult = new JButton("Show Result");
		
		JPanel dbPanel = new JPanel();
		
		dbPanel.add(initialMessage);
		dbPanel.add(takeQuery);
		dbPanel.add(showResult);
		
		//add the panel to this frame
		this.add(dbPanel);
		this.setTitle("DataBase Viewer");
	}
	
	public String getQuery()
	{
		return takeQuery.getText();
	}
	
	public void showResultActionListener(ActionListener ae)
	{
		showResult.addActionListener(ae);
	}
	
	public void displayErrorMessage(String errorMsg)
	{
		JOptionPane.showMessageDialog(this, errorMsg);
		
	}
	
	/*
	public static void main(String[] args) {
		
		DataBaseView dbView = new DataBaseView();
		dbView.setVisible(true);

	}*/
}


