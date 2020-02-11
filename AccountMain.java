import java.io.*;
import java.util.*;
import java.lang.*;

public class AccountMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Actions: 1: Add User, 2: Remove User, 3: Sign In");
		System.out.print("Action #");
		String accountActions = input.next();
		System.out.println();
		
		
		switch(accountActions)
		{
			case "1":
					AccountCreation pass = new AccountCreation();
					
					pass.inputUserName();
					pass.instructions();
					pass.inputPassword();
					pass.passwordCheck();
					pass.asciiConverter();
					System.out.println();
					
					String newAccount = pass.username + ", " + pass.password + ", " + pass.hashCode();
					
					CSVEditor c = new CSVEditor();
					c.openFile(newAccount);
					//c.addRecords(pass.username, pass.password, pass.hashCode());
					//c.closeFile();
					System.out.println(newAccount);
				break;
			
			case "2":
				
				break;
			
			case "3":
				
				break;
		}
	}

}
