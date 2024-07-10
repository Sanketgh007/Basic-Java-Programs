import java.util.Scanner;
public class Binary_search {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element present in sorted array");
		int n=sc.nextInt();	
		int ar[]=new int[n];
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
         boolean isAsc=ar[low]<ar[high];
         boolean found=false;
         while(low<=high)
		 {
			 mid=(low+high)/2;
			 
			 if(ar[mid]==key)
			 {
				 System.out.println("Key " +key+" found at position "+mid);
				 found=true;
				 break;
			 }
			 if(isAsc) {
			   if(key>ar[mid])
			 {
				 low=mid+1;
			 }
			 else if (key<ar[mid])
			 {
				 high=mid-1;
			 }}
			 else
			 {    
				 if(key>ar[mid])
				 {
					 high=mid-1;
				 }
				 else if (key<ar[mid])
				 {
					 low=mid+1;
				 }
			 }
			
			 }
         if (!found)
         {
        	 System.out.println("Searched element not present in the array");
         }
         
		 }
	}
	

