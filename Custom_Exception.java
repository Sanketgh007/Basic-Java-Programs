import java.util.*;
class UnderAgeException extends Exception
{
	public String getMessage() {
	return "Hey kid your age is not 18,come back after 18";
}
}
class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "Sorry your age is not valid";
	}
}
class Candidate
{
	int age;
	void collection()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=sc.nextInt();
	}
	void verify()throws UnderAgeException,OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
		}
		else if(age>75)
		{
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
		}
		else
		{
			System.out.println("Licence can be issued to this candidate");
		}
	}
}
public class Custom_Exception {

	public static void main(String[] args) {
		try {
			Candidate c1=new Candidate();
			c1.collection();
			c1.verify();
			
		}
		catch(UnderAgeException e1)
		{
			System.out.println("Under Age Exception handled in main");
		}
		catch(OverAgeException e2)
		{
			System.out.println("Over Age Exception habdled in main");
		}
		catch(Exception e)
		{
			System.out.println("All exception handled");
		}

	}

}
