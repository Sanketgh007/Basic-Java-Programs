import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		System.out.println("Enter how many elements you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		  
		}
		System.out.println("Unsorted array is");
		for(int i=0;i<n;i++)
		{
		  
			System.out.println(+arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
				
					
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(+arr[i]);
		}
	}

}
