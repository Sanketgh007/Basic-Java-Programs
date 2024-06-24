import java.io.*;
import java.util.Scanner;
public class TwodArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of columns");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("Enter the numbers in the matrix");
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) 
        		 a[i][j]=sc.nextInt();		
        }
        System.out.println("Entered numbers in the matrices are");
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++)
        		System.out.print( a[i][j]+"\t");
        	System.out.println();
	}}

}
