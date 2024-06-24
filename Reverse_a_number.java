package Reverse_a_number;
import java.util.Scanner;
public class Reverse_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem;
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("Reverse of entered number is "+rev);

	}

}
