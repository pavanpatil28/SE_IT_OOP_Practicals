// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;  
// Importing the Java Formatter class to format the output.
import java.util.Formatter;
// Importing the Java Random class get random output.
import java.util.Random;  

abstract class Bank_System
{
	abstract public void Create_Account(); 
    abstract public void Deposit();
	abstract public void Withdraw();
	abstract public void Check_Bank_Balance();
	abstract public void Display_Account_Info();
}

// Creating Class Bank 
class Bank
{
	// Creating private data members
    private
    String name,Account_type,dob;
    int Account_No,age,flag = 0;
    static int Bank_Balance = 0;

    // Creating a method for taking input data from user
    public void Create_Account() 
    {
    	// Creating the object sc of the Scanner file
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        // Taking input data from user
        System.out.println("\n=====================================================================");
        System.out.println(" >>> Enter the Bank Account Details :- \n");
        System.out.print(" >> Enter the Name of the Account Holder        :: ");
        name = sc.next();
        System.out.print(" >> Enter the Age of the Account Holder         :: ");
        age = sc.nextInt();        
        System.out.print(" >> Enter the Birth Date of the Account Holder  :: ");
        dob = sc.nextInt();
        System.out.println("\n >> Select any Type of Account :- ");
        System.out.print("\n \t 1] Saving \t 2] Current \n\n >> Enter  :: ");    
        int choice1 = sc.nextInt();
        
        if(choice1 == 1)
        {
        	 Account_type = "Saving";
        }
        if(choice1 == 2)
        {
       	 	Account_type = "Current";
        }
       
        System.out.print("\n >> Get a Account Number :- ");
        System.out.print("\n\n \t 1] Yes \t 2] No \n\n >> Enter  ::  ");    
        int choice2 = sc.nextInt();
      
        System.out.print("\n >> Enter the Amount (Min-Rs-500)               :: ");
        Bank_Balance = sc.nextInt();
        
     // Condition for checking the age limit
        if(age>=18 && age<=100) 
        {
        	flag++;
        }
        
        else if (age>100)
        {
        	// Display message
            System.out.println("\n --> Entered Age is Invalid ");
            System.out.println("=====================================================================");
            
            // method call
            Create_Account();
        }
        
        else 
        {
        	// Function call 
        	Age_Check();
            System.out.println("=====================================================================\n");
        }
        
        if(choice1 != 1 && choice1 != 2)
        {
        	System.out.println("\n --> Entere a Valid Choice to Select a Account Type \n");
            System.out.println("=====================================================================");
           
        	// method call
            Create_Account();            
        }
        
        if(choice2 == 1)
        {        	  
            Account_No = ran.nextInt(1111111111);
        	System.out.println("\n --> Account Number is " + Account_No);
        }      
        if(choice2 == 2)
        {
        	System.out.println("\n --> No Account Can be Created without Account Number \n");
            System.out.println("=====================================================================");
           
        	// method call
            Create_Account();
        }
        
        // Condition for checking the bank balance limit
        if(Bank_Balance>=500) 
        {
        	flag++;
        	
        	// Display message
            System.out.println("\n --> Bank Account Created Successfully \n");
            System.out.println("=====================================================================");
        }
        
        else 
        {
            // method call
        	Bank_Balance_check();
        }
    }
    
    // method to check the age of user
    public void Age_Check() 
    {
        	System.out.println("\n --> Entered Age is less than 18 Account cannot be Created ");
            System.out.println("=====================================================================");
            
            // method call
            Create_Account();
    }
    
    // method to check the bank balance of the user
    public void Bank_Balance_check()
    {
    	// Display message
    	System.out.println("\n --> Entered Bank Balance is less than \n\tRs-500 Account cannot be Created ");
        System.out.println("=====================================================================");
        
        // method call
    	Create_Account();
    }    

    // Creating method to Deposit money
    public void Deposit()
    {
    	// Condition true if Account is Created
        if(flag >= 2)
        {
        	// Creating a data member 
        	int deposit;
        	
        	// Creating the object sc of the Scanner file
            Scanner sc = new Scanner(System.in);

            // Taking input from user
            System.out.println("\n=====================================================================");
            System.out.print(" >> Enter the Amount to Deposit = ");
            deposit = sc.nextInt();
            
            // Computing the bank balance after deposit 
            Bank_Balance += deposit;
            
            // Displaying bank balance after deposit
            System.out.print("\n --> Bank Balance after Deposit = " + Bank_Balance);
            System.out.println("\n==================================================================");
        }
        
        else
        {
        	// Display message
        	System.out.println("\n --> Create a Bank Account First ");
            System.out.println("=====================================================================");
        }

    }

    // Creating method to withdraw money
    public void Withdraw()
    {
    	// Condition true if Account is Created
        if(flag >= 2)
        {
        	// Declaring the data member
        	int withdraw;
        	
        	// Creating the object sc of the Scanner file
            Scanner sc = new Scanner(System.in);
            System.out.println("\n=====================================================================");
            
            // Taking input from user
            System.out.print(" >> Enter the Amount to Withdraw = ");
            withdraw = sc.nextInt();
            
            // Condition for withdraw limit
            if(withdraw>Bank_Balance)
            {
            	// Display message
                System.out.println("\n\t\t !!!!! Amount not debited !!!!!! \n");
                System.out.println(" --> The Entered Amount is greater than the Bank Balance in the Account ");
                System.out.println("=====================================================================");
            }
            
            // Condition for withdraw limit
            else if(withdraw>=20000)
            {
            	// Display message
                System.out.println("\n\t\t !!!!! Amount not debited !!!!!! \n");
                System.out.println(" --> The Entered Amount is greater than minimum withdraw limit ");
                System.out.println("=====================================================================");
            }
            
            // Amount will withdraw Successfully
            else
            {
            	// computing bank balance after withdraw	
                Bank_Balance -= withdraw;
                
                // displaying bank balance after withdraw
                System.out.println("\n --> Bank Balance after Withdraw = " + Bank_Balance);
                System.out.println("=====================================================================");

            }
        }
        else
        {
        	// Display message
        	System.out.println("\n --> Create a Bank Account First ");
            System.out.println("=====================================================================");
        }

    }

    // Creating method to check bank balance 
    public void Check_Bank_Balance() 
    {

    	// Condition true if Account is Created
        if(flag >= 2)
        {
        	// Displaying the user bank balance 
        	System.out.println("\n --> Bank Balance of the Account is Rs = " + Bank_Balance);
            System.out.println("=====================================================================");
        }
        
        else
        {
        	// Display message
        	 System.out.println("\n --> Create a Bank Account First ");
            System.out.println("=====================================================================");
        }

    }
    
    // Creating method to display the account details 
    public void Display_Account_Info() 
    {
    	// Condition true if Account is Created
        if(flag >= 2)
        {
        	// Creating object fmt of class Formatter
        	Formatter fmt1 = new Formatter(); 
        	Formatter fmt2 = new Formatter(); 
        	Formatter fmt3 = new Formatter(); 
        	Formatter fmt4 = new Formatter(); 
        	Formatter fmt5 = new Formatter(); 
        	Formatter fmt6 = new Formatter(); 
        	
        	// Display data
        	System.out.println("\n \t\t ========================= ");
    		System.out.println(" \t\t ||   Account Details   || ");
    		System.out.println(" \t\t ========================= \n");
        	
    		System.out.println("  ===================================================================== ");
    		System.out.print("  || 1] Name of the Account Holder is         || ");
    		fmt1.format("%2s", name);
    		System.out.println(fmt1);
    		System.out.print("  ===================================================================== \n");
    		System.out.print("  || 2] Age of the Account Holder is          || ");
    		fmt2.format("%2s", age);	
    		System.out.println(fmt2);
    		System.out.print("  ===================================================================== \n");
    		System.out.print("  || 3] Date of Birth of the Account is       || ");
    		fmt3.format("%2s", dob);		
    		System.out.println(fmt3);
    		System.out.print("  ===================================================================== \n");
    		System.out.print("  || 4] Type of the Account is                || ");
    		fmt4.format("%2s", Account_type);		
    		System.out.println(fmt4);
    		System.out.print("  ===================================================================== \n");
    		System.out.print("  || 5] Bank Account Number is                || ");
    		fmt5.format("%2s", Account_No);		
    		System.out.println(fmt5);
    		System.out.print("  ===================================================================== \n");
    		System.out.print("  || 6] Bank Balance of the Account is Rs     || ");       		
    		fmt6.format("%2s", Bank_Balance);		
    		System.out.println(fmt6);   		
            System.out.println("  =====================================================================");
        }
        else
        {
        	// Display message
        	 System.out.println("\n --> Create a Bank Account First ");
             System.out.println("=====================================================================");
        }
    }

}

// Creating a Main class Bank Account
public class Bank_Account {

    public static void main(String[] args) {

    	// Creating object obj of class Bank
        Bank obj = new Bank();
    	System.out.println("\n \t\t ========================= ");
		System.out.println(" \t\t ||   Welcome to Bank   || ");
		System.out.println(" \t\t ========================= ");

        // Using a infinite While loop for performing operations infinite times
        while(true) 
        {
            // Creating the object sc of the Scanner file
            Scanner sc = new Scanner(System.in);
            
            // Declaring integer variable choice to take the user's choice
            int choice;
        	System.out.println("\n=====================================================================");
        	
            // Creating a Menu to Ask the User about which Operation to be Performed
            System.out.println(" >>> Bank Menu :- ");
            System.out.print("\n 1] Create a Bank Account \t\t 2] Deposit Money in Account \n 3] Withdraw Money from Account \t 4] Check Bank Balance \n 5] Display Account Info \t\t 6] Exit Bank \n\n >> Enter the Operation to be Performed  ::  ");

            // Taking Input from user
            choice = sc.nextInt();
            System.out.println("=====================================================================");
            
            // Condition to stop the Program
            if (choice == 6) 
            {
            	// Display message
                System.out.println("\n \t\t -----> Bank Exited Successfully --> ");
                System.out.println("\n=====================================================================");
                break;
            }

            else
            {
                // Using switch case for different operations to perform
                switch(choice) 
                {

                    case 1 :
                    	// calling method create account
                        obj.Create_Account();
                        break;

                    case 2 :
                    	// calling method deposit
                        obj.Deposit();
                        break;

                    case 3 :
                    	// calling method withdraw
                        obj.Withdraw();
                        break;

                    case 4 :
                    	// calling method check bank balance
                        obj.Check_Bank_Balance();
                        break;

                    case 5 :
                    	// calling method display account detail
                        obj.Display_Account_Info();
                        break;

                }

            }

        }

    }

}
