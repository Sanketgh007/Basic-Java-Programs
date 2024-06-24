package Lsearch;
import java.util.Scanner;

public class Lsearch {

	public static void main(String[] args) {
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter how many element you want to enter ");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elemet you want to search ");
		int ele=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("Element "+ele+" found at position "+i);
				flag=true;
			    
			}
			
		}
		 if(flag!=true)
		{
			System.out.println("Element not found! ");
		}
		

	}

}
