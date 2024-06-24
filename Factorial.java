package Factorial;
import java.util.*;


public class Factorial {
	public  int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*fact(num-1);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Factorial f=new Factorial();
		 System.out.println("Factorial of entered number is :"+f.fact(n));	

	}

}
