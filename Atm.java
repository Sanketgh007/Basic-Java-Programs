import java.util.*;

/* Mini Project - ATM
   -> Check Balance
   -> Cash withdraw
   -> User Details
   -> Update Mobile No.
*/


class Atm										// class atm 
{
private	long  account_No;									// private member varibles
	
	private String name;
	private int PIN;
	private double balance;
	private String mobile_No;

											// public member functions

	// setData function is setting the Data into the private member variables
	public void setData(long  account_No_a, String name_a, int PIN_a, double balance_a, String mobile_No_a)
	{
		account_No = account_No_a;	 // assigning the formal arguments to the private member var's
		name = name_a;
		PIN = PIN_a;
		balance = balance_a;
		mobile_No = mobile_No_a;
	}

	//getAccountNo function is returning the user's account no.
	long  getAccountNo()
	{
		return account_No;
	}
	
	//getName function is returning the user's Name
	String getName()
	{
		return name;
	}

	//getPIN function is returning the user's PIN
	int getPIN()
	{
		return PIN;
	}

	//getBalance is returning the user's Bank Balance
	double getBalance()
	{
		return balance;
	}

	//getMobileNo is returning the user's Mobile No.
	String getMobileNo()
	{
		return mobile_No;
	}

	//setMobile function is Updating the user mobile no
	void setMobile(String mob_prev, String mob_new)		
	{
		if (mob_prev == mobile_No)						// it will check old Mobile no
		{
			mobile_No = mob_new;						// and Update with new, if old matches
			System.out.println("Sucessfully Updated Mobile no."); 				//getch is to hold the screen ( untill user press any key )																			
		}

		else							// Does not update if old mobile no. does not matches
		{
			System.out.println("Incorrect !!! Old Mobile no");
			
		}
	}

	//cashWithDraw function is used to withdraw money from ATM
	void cashWithDraw(int amount_a)
	{
		if (amount_a > 0 && amount_a < balance)		// check entered amount validity
		{
			balance -= amount_a;		// balance = balance - amount_a
		System.out.println("Please Collect Your Cash");
			System.out.println("Available Balance :"+ balance); 
			
		}

		else
		{
			System.out.println("Invalid Input or Insufficient Balance"); 
			
		}
	}




/////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String []args)
{
	
    Scanner sc=new Scanner(System.in);
	int choice = 0, enterPIN;		//enterPIN and enterAccountNo. ---> user authentication
	long  enterAccountNo;


	// created User ( object )
	Atm user1=new Atm();
	// Set User Details ( into object )         ( Setting Default Data )
	user1.setData(1234567, "Tim", 1111, 45000.90, "9087654321");


	do
	{


		System.out.println("****Welcome to ATM*****"); 
		System.out.println("Enter Your Account No "	);   // asking user to enter account no
		enterAccountNo=sc.nextLong();

		System.out.println("Enter PIN "	); 		 // asking user to enter PIN
		enterPIN=sc.nextInt();



		// check whether enter values matches with user details
		if ((enterAccountNo == user1.getAccountNo()) && (enterPIN == user1.getPIN()))
		{
			do
			{
				int amount = 0;
				String oldMobileNo, newMobileNo;

				// user Interface
				System.out.println("**** Welcome to ATM *****" ); 
				System.out.println("Select Options "); 
				System.out.println("1. Check Balance"); 
				System.out.println("2. Cash withdraw");
				System.out.println("3. Show User Details"); 
				System.out.println("4. Update Mobile no.");
				System.out.println("5. Exit" ); 
				 choice=sc.nextInt();						// taking user choice

				switch (choice)						// switch condition
				{
				case 1:								// if user presses 1 
					System.out.println("Your Bank balance is :" + user1.getBalance() );
													// getBalance is ... printing the users									bank balance
				
					break;


				case 2:									// if user presses 2
					System.out.println("Enter the amount :"	); 	
					amount=sc.nextInt();
					user1.cashWithDraw(amount);			// calling cashWithdraw function 
													    // passing the withdraw amount 
					break;


				case 3:										// if user presses 3
					System.out.println("*** User Details are :- ");  
					System.out.println("-> Account no" + user1.getAccountNo());
					System.out.println( "-> Name      " + user1.getName());
					System.out.println( "-> Balance   " + user1.getBalance());
					System.out.println("-> Mobile No." + user1.getMobileNo()); 
													// getting and printing user details
					break;


				case 4:								   //  if user presses 4
                    System.out.println("Enter Old Mobile No. ");
					 oldMobileNo=sc.next();							// take old mobile no

				System.out.println("Enter New Mobile No. "); 
					newMobileNo=sc.next();							// take new mobile no

					user1.setMobile(oldMobileNo, newMobileNo);	// now set new mobile no
					break;

													// if user presses 5
				case 5:
					System.exit(0);					// exit application

				default:							// handle invalid user inputs
					System.out.println("Enter Valid Data !!!"); 
				} 

			} while (true);				// MENU	   // condition will always TRUE and loop is										capable of running infinite times
		}

		else
		{
			System.out.println("User Details are Invalid !!! "); 
			
		}
	} while (true);						//LOGIN		// condition will always TRUE and loop is										capable of running infinite times

}
}
