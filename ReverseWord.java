import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		System.out.println("Reversing a sentence ");
		for(int i=(str.length-1);i>=0;i--) {
			System.out.print(str[i] +" ");
		}
         
	}

}
