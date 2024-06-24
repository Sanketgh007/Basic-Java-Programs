package Charcheck;
import java.util.*;
public class Charcheck {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Charecter");
		char s=sc.next().charAt(0);
		if(s>='A'&&s<='Z')
			System.out.println(s+" is a capital Letter");
		else if(s>='a'&&s<='z')
			System.out.println(s+" is a small Letter");
		else if(s>='0'&&s<='9')
			System.out.println(s+" is a number");
		System.out.println(1);
	}

}
