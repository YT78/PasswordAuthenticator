import java.io.*;
import java.util.*;
import java.lang.*;

public class CSVEditor {
	
	Scanner input = new Scanner(System.in);
//	public void fileAdd() throws IOException {
//	    BufferedWriter writer = new BufferedWriter(new FileWriter(
//	            "accounts.csv"));
//	    // Write these lines to the file.
//	    // ... We call newLine to insert a newline character.
//	    writer.write("CAT");
//	    writer.newLine();
//	    writer.write("DOG");
//	    writer.newLine();
//	    writer.write("BIRD");
//	    writer.close();
	
	private Formatter form;
	
	public void openFile(String text) {
//		try {
//			form = new Formatter("accounts.csv");
//			//System.out.println("File Created");
//		}
//		catch(Exception e) {
//			System.out.println("Error Creating File");
//		}
//        String path = System.getProperty("user.dir") + "accounts.csv";
        //String text = "Added text";
        try {
            FileWriter fw = new FileWriter("accounts.txt", true);
            fw.write(text + "\n");
            fw.close();
            
            System.out.println("File Edited");
        }
        catch(IOException e) {
        	System.out.println("File Not Edited");
        }
	}
	
//	public void addRecords(String username, String password, int i) {
//		form.format("%s %s %d %n", username + ", ", password + ", ", i);
//	}
	
	public void closeFile() {
		form.close();
	}
}
