import java.util.Scanner;
public class Binary_search {
	
	public static void main(String[] args) {
		int ar[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element present in sorted array");
		int n=sc.nextInt();	
		System.out.println("Enter array element in sorted order");
		for(int i=0;i<n;i++)
		{
			 ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements are");
		for(int i=0;i<n;i++)
		{
			 System.out.println(ar[i]);
		}
		System.out.println("Enter the element to be search");
		int key=sc.nextInt();
         int low=0,high=n-1;
    	 int mid;
         
         while(low<=high)
		 {
			 mid=(low+high)/2;
			 if(ar[mid]==key)
			 {
				 System.out.println("Key " +key+" found at position "+mid);
				 break;
			 }
			 else if(key>ar[mid])
			 {
				 low=mid+1;
			 }
			 else if(key<ar[mid])
			 {
				 high=mid-1;
			 }
			 else
			 {
				System.out.println("Element not found");
			 }
		 }
	}
	
}
