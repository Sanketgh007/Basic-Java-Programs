import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Binary conversion is given by ");
		BinaryC(num);
		
	}
	public static void BinaryC(int num) {
		int binary[]=new int[100];
		int start=0;
		while(num>0)
		{
			int rem=num%2;
			binary[start++]=rem;
			num=num/2;
		}
for(int i=start-1;i>=0;i--)
{
	System.out.println(binary[i]);
}


	}
}