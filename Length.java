import java.util.*;
public class Length {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
			count++;
		}
		System.out.println("The length of the string is "+count);
	
	}
}
