import java.io.*;
import java.util.*;
import java.lang.*;

public class CSVEditor {
	
	//Scanner input = new Scanner(System.in);
	
	private Formatter form;
	
	public void openFile() {
		try {
			form = new Formatter("accounts.csv");
			//System.out.println("File Created");
		}
		catch(Exception e) {
			System.out.println("Error Creating File");
		}
	}
	
	public void addRecords(String username, String password, int i) {
		form.format("%s%s%d", username + ", ", password + ", ", i);
	}
	
	public void closeFile() {
		form.close();
	}
}