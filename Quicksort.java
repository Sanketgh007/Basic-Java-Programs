import java.util.Scanner;

public class Quicksort {
	static void Qs(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=Partition(arr,low,high);
			Qs(arr,low,pi-1);
			Qs(arr,pi+1,high);
		}
	}
	static int Partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Entered element is ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array after sorting ");
		Qs( arr,0,arr.length-1);
		for(int num:arr)
		{
			System.out.println(num);
		}

	}

}
