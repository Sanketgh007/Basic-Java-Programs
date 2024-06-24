package Conversion_table;
import java.util.Scanner;
public class CtofConversionTable {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Conversion Table");
	System.out.println("Enter how much conversion you need to do");
	int total=sc.nextInt();
	for(float c=0;c<=total;c++)
	{
		float f=((c*9/5)+32);
		System.out.println(+c+"'c is "+f+"'F");
	}
}}
