package mvc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class DataBaseControl{

	private DataBaseModel dbm;
	private DataBaseView dbv;
	
	DataBaseControl(DataBaseModel dbm, DataBaseView dbv)
	{
		this.dbm = dbm;
		this.dbv = dbv;
		dbm.LoadDataBase();
		dbv.setVisible(true);
		this.dbv.showResultActionListener(new ResultListener());
	}
	
	
	class ResultListener extends Exception implements ActionListener 
	{
		String query;
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			query = dbv.getQuery();
			
			StringBuffer strbf = new StringBuffer();
			
			if(query.equalsIgnoreCase("all"))
			{
				Iterator it = dbm.iterator();
				while(it.hasNext())
				{
					strbf.append(it.next());
					
				}
				JOptionPane.showMessageDialog(dbv, strbf.toString());
			}
			else if (query.contains("name")){
				
				String[] data = query.split(":");
				Integer id = dbm.getId(data[1]);
				if(id == null)
					JOptionPane.showMessageDialog(dbv, "There is no such student...");
				else
					JOptionPane.showMessageDialog(dbv, id.toString());
			}
			else if (query.contains("id")){
				
				String[] data = query.split(":");
				String name;
				try {
					name = dbm.getName(Integer.parseInt(data[1]));
				}catch(NumberFormatException a) { 
			        name = null; 
			    } catch(NullPointerException b) {
			        name = null;
			    }
				if(name == null)
					JOptionPane.showMessageDialog(dbv, "There is no such student...");
				else
					JOptionPane.showMessageDialog(dbv, name);
		
			}
			else
			{
				dbv.displayErrorMessage("Please type a valid query (all/name/id)");
			}
			
		}
		
	}
	
}
