import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter how many element present in array");
		int n=sc.nextInt();	
		int ar[]=new int[n];
		System.out.println("Enter array element in any order");
		for(int i=0;i<n;i++)
		{
			 ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements are");
		for(int i=0;i<n;i++)
		{
			 System.out.println(ar[i]);
		}
		Insertionsort(ar);
		System.out.println(Arrays.toString(ar));
}
	public static void Insertionsort(int ar[]) {
		for(int i=0;i<ar.length-1;i++)
		{
			for (int j=i+1;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					swap(ar,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		
	}
    public static void swap(int ar[],int j,int p)
	{
		int temp=ar[j];
		ar[j]=ar[p];
		ar[p]=temp;
	}
	
}