package Triangle;
import java.util.Scanner;
public class Triangle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		System.out.println("Enter the number");
		int c=sc.nextInt();
		if((a+b>c)||(b+c>a)||(c+a>b))
		{
			System.out.println("Valid traingle");
		}
		else
		{
			System.out.println("Invalid traingle");
		}
		
	}

}
