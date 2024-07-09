import java.util.Scanner;

public class TableinReverseOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		printReverse(n);
	}
	public static void printReverse(int n) {
		int i=10;
		while(i>0)
		{
			int table=i*n;
			System.out.println(table);
			i--;
			System.out.println();
		}

	}

}
