package Armstrong_number;
import java.util.*;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,temp,sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum+=r*r*r;
		}
		if(sum==temp)
		{
			System.out.println("Entered number " +temp+ " is Armstrong number");
		}
		else
		{
			System.out.println("Entered number " +temp+ " is not  Armstrong number");
		}
		

	}

}
