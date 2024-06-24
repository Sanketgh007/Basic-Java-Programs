import java.util.Scanner;

public class ArmNumRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int a=sc.nextInt();
		System.out.println("Enter the upper limit");
		int b=sc.nextInt();
		ArmFind(a,b);
	}
		 static void ArmFind(int a,int b)
		{
			for(int i=a;i<=b;i++)
			{
				int num=i;
				int sum=0;
				while(num!=0)
				{
					int rem=num%10;
					num=num/10;
					sum+=rem*rem*rem;
				}
				if(sum==i)
				System.out.println("Armstrong number is "+sum);
			}
			
		}

	}


