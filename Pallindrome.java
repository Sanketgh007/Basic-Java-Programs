import java.util.*;
public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
			String rev="";
			System.out.println("Enter the string to check the palindrome");
			s=sc.next();
			System.out.println(s);
			 
			for(int i=(s.length()-1);i>=0;--i)
			{
				rev=rev+s.charAt(i);
			}
				
			if(s.equals(rev))
			{
				System.out.println("The string "+rev+" is a palindrome");
				
			}
			else
			{
				System.out.println("The string "+s+" is not palindrome");
			}	
		}
	}

