package Tower_of_hanoi;
import java.util.*;
public class Tower_of_hanoi {
	public static void tower(int n,char s,char t,char d)
	{
		if(n==0)
			return ;
		tower(n-1,s,d,t);
		System.out.println("\n Move disk "+n+ " from " +s+ " to "+d);
		tower(n-1,t,s,d);	
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char A,B,C;
		System.out.println("Enter the number of disks");
		int n=sc.nextInt();
		System.out.println("Sequence of disks");
		tower(n,'A','B','C');
		System.out.println("\n");
	}
}
