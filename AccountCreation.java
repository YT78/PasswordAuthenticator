
/**
 * 
 */
import java.util.Scanner;
public class AccountCreation {
	  String password;
	  String username;
	/**
	 * 
	 */
	public void instructions()
	{
	
		System.out.println("enter a passwor that contains:");
		System.out.println("between 8 and 15 characters");
		System.out.println("At least 1 special character: !@#$%");
		System.out.println("Cannot contain the word \"password\" in any case");
		System.out.println("contains no spaces");
	}
	
	
	public void inputUserName()
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Create your user name: ");
		username  = input.nextLine();
		
	}
	
	public void inputPassword()
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Create your password: ");
		password  = input.nextLine();
		
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean verifyLength()
	{
		boolean verify = false;
		if((password.length() >= 8) && (password.length() <= 15 ))
		{
			verify = true;
		}
		else
		{
			System.out.println("Your password does not meet the length requirement");
		}
		return verify;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean verifyUpper()
	{
		
		boolean verify = false;
		
		for(int i = 0; i < password.length(); i++)
		{
		
			char character=password.charAt(i);
			if(character>='A' &&character<='Z')
			{
				verify=true;
			}
			
			
		}
		
		if(!verify)

			System.out.println("Your password must have at least one upper case");
			
		
		return verify;
	}	
		
	public boolean verifySpace()
	{
		
		boolean verify = true;
		
			int i=-1;
			i=password.indexOf(' ');
			
			if(i!=-1 )
			{
				verify=false;
			}
			
			
	
		
		if(!verify)

			System.out.println("Your password can not have space");
			
		
		return verify;
	}	

	/**
	 * 
	 * @return
	 */
		public boolean verifySpecial()
		{
			boolean verify = false;
			
			for(int i = 0; i < password.length(); i++)
			{
			
				char character=password.charAt(i);
				if(character=='!' ||character=='@'||character=='#'||character=='$'||character=='%')
				{
					verify=true;
				}
				
				
			}
			
			if(!verify)

				System.out.println("Your password must have a special character");
				
			
			return verify;
		}
		      
		
		/**
		 * 
		 * @return
		 */
		public boolean containsPassword()
		{
			//String newPassword = password;
			boolean verify = false;
			String str = "password";
			if(password.toLowerCase().contains(str))
			{
				//verify = true;
				System.out.println("contains the word pasword");
				return true;
			}
			//if(verify)

			return false;
		}
		
		/**
		 * 
		 * @return
		 */
		public boolean passwordCheck()
		{
			
			boolean isValid= false;

			
			while((!verifyLength()) || (!verifyUpper()) || (!verifySpecial()) || (containsPassword())||(!verifySpace()))
			{
				inputPassword();
				break;
			}
			return isValid;
			
		}
		
		/**
		 * 
		 * @return
		 */
		public int asciiConverter()
		{
			System.out.print("the hash is: ");
			for(int i = 0; i < password.length(); i++)
			{
			
				char character= password.charAt(i);
				int ascii = (int) character;
				int newAscii = ascii + 1;
				
				char newPassword = (char) newAscii;
				System.out.print(newPassword);
				
			
		}
		return 0;
	

}
}
