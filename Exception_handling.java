import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            	System.out.println("Enter the number");
            	int num1=sc.nextInt();
            System.out.println("Enter the second number"); 
            int num2=sc.nextInt();
            int result=num1/num2;
            
        } catch (ArithmeticException e) {
           
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
    
            System.out.println("This block will always be executed.");
        }
 
    }
    
    }

