package Power_of_number;
import java.util.*;

public class Power_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res=1;
		System.out.println("Enter the base of a number");
		int base=sc.nextInt();
		System.out.println("Enter the exponent of a number");
		 int  exp=sc.nextInt();
		int ex=exp;
		while(exp!=0)
		{
			res*=base;
			exp--;
		}
		
		System.out.println(+base+"^"+ex+"="+res);

	}

}
