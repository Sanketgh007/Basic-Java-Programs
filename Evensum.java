package Evensum;
import java.util.Scanner;
public class Evensum {
public static void main(String []args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Sum of n even numbers");
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	int i=0;
	int sum=0;
	while(i<=n)
	{
		sum=sum+i;
		i=i+2;	
	}
	System.out.println("Sum of n even number is "+sum);
}
}
