package Psbv;
import java.util.Scanner;

public class Psbv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int v=sc.nextInt();
		Passbyvalue(v);
		System.out.println("Entered value is "+v);
		System.out.println("Hence the value does not get modified it is example of pass by value in java!");

	}
	public static void Passbyvalue(int a)

	{
		 a=100;
	}
}
