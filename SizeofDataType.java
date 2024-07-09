import java.util.Scanner;

public class SizeofDataType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of ttimes you want to find the size of datatype");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
		System.out.println("1.Integer\n2.Charecter\n3.Long\n4.Float\n5.Double");
		System.out.println("Enter your choice in number");
		String choice=sc.next();
		Size(choice);
	}}
	public static void Size(String choice)
	{
		switch(choice)
		{
			case "1":
				System.out.println("The size of datatype Integer is 4"); 
				break;
			case "2":
				System.out.println("The size of datatype Charecter is 2"); 
				break;
			case "3":
				System.out.println("The size of datatype Long is 8"); 
				break;	
			case "4":
				System.out.println("The size of datatype Float is 4"); 
				break;	
			case "5":
				System.out.println("The size of datatype Double is 8"); 
				break;
			default:
				System.out.println("Invalid Input");			
		}
	}

}
