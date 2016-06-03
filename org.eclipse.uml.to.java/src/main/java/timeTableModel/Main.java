package timeTableModel;

import java.text.ParseException;

public class Main {
	public static void main(String[] args){
		
		try {
			TimeTableDB.loadDB();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TimeTableDB.showDB();
	}
}
