import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	if(i*i==n)
	{
		flag=1;
	}}
	if(flag==1)
	{
		System.out.println("Perfect sqare");
	}
	else
		System.out.println("Not a square number");
	}

}
