package ArrayCopy;
import java.util.Scanner;
public class ArrayCopy {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]=new int[30];
		int b[]=new int[25];
		System.out.println("Enter the array value");
		for(int i=0;i<4;i++)
		{	
			a[i]=sc.nextInt();			
		}
		System.out.println("First array value=");
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<4;i++)
		{
			b[i]=a[i];	
			
		}
		System.out.println("Second array value=");
		for(int i=0;i<4;i++)
		{	

			System.out.println(b[i]);		
		}	
		
	}

}
