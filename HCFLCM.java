import java.util.*;
public class HCFLCM {
	public void Hcf(int num1,int num2)
	{     int hcf=0;
	for (int i=1;i<=num1||i<=num2;i++)
	{
		if (i%num1==0&&i%num2==0)
		{
			hcf=i;

		}
	}
	System.out.println("HCF of a number is "+hcf);

	}
	public void Lcm(int num1,int num2)
	{
		int lcm=0;
		int max=(num1>num2)?num1:num2;
		for(int i=max;i<=num1*num2;i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				lcm=i;
			}
		}
		System.out.println("LCM of entered number is " +lcm);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		HCFLCM hcf=new HCFLCM();
		HCFLCM lcm=new HCFLCM();
		hcf.Hcf(num1, num2);
		lcm.Lcm(num1, num2);

	}

}
