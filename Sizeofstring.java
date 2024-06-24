import java.util.Scanner;

public class Sizeofstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder n=new StringBuilder();
		int count=0;
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
			count++;
			 n=n.append(s.charAt(i));
		}
  
	}
		 System.out.println("Length of entered string is "+count);
		 System.out.println("String without space is "+n);
}
}