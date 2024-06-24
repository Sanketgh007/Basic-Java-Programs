package Prime;
import java.util.*;
public class Prime {
	public static void main(String args[])
	{
	int num;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	 if(n>0)
	{
  	for( num=2;num<=n-1;num++)
		if(n%num==0)
		{
			flag++;
		}		
	if(flag>=1)
	{
		System.out.println(n+ " is not a prime number");
	}
	else
		System.out.println(n+" is a prime number");
	}
	 else
	System.out.println("Invalid Input");
	}}