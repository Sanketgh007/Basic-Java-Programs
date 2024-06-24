import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    System.out.println("Enter your choice");
    String choice=sc.next();
    double result=0;
    switch(choice)
    {
    case "+":
    	result =a+b;
    	break;
    case"-":
    	result=a-b;
    	break;
    case"*":
    	result=a*b;
    case"/":
    	if(b==0)
    	{
    		System.out.println("Invalid Input");
    	}
    	else {
    		result=a/b;
    	}
    	break;
    default:System.out.println("Invalid Operator");	
    	
           
    }
     System.out.println("Output is: "+result);
	}

}
