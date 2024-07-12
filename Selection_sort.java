import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
	
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
		sortedArray(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void sortedArray(int ar[])
	{
		int start=0;
		for(int i=0;i<ar.length;i++)
		{
			int last=ar.length-i-1;
			int maxIndex=getMax(ar,start,last);
			swap(ar,maxIndex,last);
		}
	}
	public static int getMax(int ar[],int start,int last)
	{
	    int max=start;
		for(int i=0;i<=last;i++)
		{
			if(ar[max]<ar[i])
			{
				 max=i;
			}
		}
		return max;
	}
	public static void swap(int ar[],int maxIndex,int last)
	{
		int temp=ar[maxIndex];
		ar[maxIndex]=ar[last];
		ar[last]=temp;
	}

}
