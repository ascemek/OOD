package mvc1;

public class DemoMVC {

	public static void main(String[] args)
	{
		DataBaseModel dbm = new DataBaseModel();
		DataBaseView dbv = new DataBaseView();
		DataBaseControl dbc = new DataBaseControl(dbm, dbv);
			
	}
	
	
}
