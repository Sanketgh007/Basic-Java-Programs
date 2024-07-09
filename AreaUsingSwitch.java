import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class AreaUsingSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice either 1 or 2");
		String choice=sc.nextLine();
		switch(choice)
		{
		case "1":
			System.out.println("Area of Circle");
			System.out.println("Enter the radius");
			float r=sc.nextFloat();
			double area1=3.14*r*r;
			System.out.println("Area of circle is "+area1);
			break;
		case "2":
			System.out.println("Area of Rectangle");
			System.out.println("Enter the Length");
			float l=sc.nextFloat();
			System.out.println("Enter the Breadth");
			float b=sc.nextFloat();
			double area2=l*b;
			System.out.println("Area of circle is "+area2);
			break;
		default:
			System.out.println("Invalid Input");
			
		}
	}

}
