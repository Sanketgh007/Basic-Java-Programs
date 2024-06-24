package Prime_factors;
import java.util.*;
public class Prime_factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{     flag=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						flag++;
					}}
					if(flag==2)
					{
						System.out.println("Prime factors are "+i);
				}
			}
		}
}
}