package Duplicate_array;
import java.util.Scanner;
public class Duplicate_array {
	public static void main(String[] args) {
		int n;
		int count=0;
		int a[]=new int[100];	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to enter:");
		 n=sc.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array values are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]==a[j])
			{   
				System.out.println("Duplicate element found "+a[i] );
			}
		}
		
		}}}

