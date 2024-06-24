import java.util.*;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int number=num;
		int sum=0;
		while(num!=0)
		{
			int n=num%10;
			  sum+=n;
			  num/=10;
		}
		if(number%sum==0)
		{
			System.out.println("Entered number "+number+" is a harshad number");
		}
		else
		{
			System.out.println("Entered number "+number+" is not a harshad number");
		}
	}
}
