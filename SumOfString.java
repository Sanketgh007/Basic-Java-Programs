import java.util.Scanner;

public class SumOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String");
		 String s = sc.nextLine();
		 int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			sum+=s.charAt(i);
			
		}
	        System.out.println(sum);
	}

}
