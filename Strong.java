import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	 int temp=n;
		
		int sum=0;
		while(n!=0)
		{   int f=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				 f=f*i;
			}
			 sum=sum+f;
			 n=n/10;
		}
if(temp==sum)
{
	System.out.println(temp+" is a Strong number");
}
else
{
	System.out.println(temp+" is not a strong number");
}
	}

}
