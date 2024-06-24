import java.util.Arrays;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char ch[]=s.toCharArray();
		int freq[]=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{    
			freq[i]=1;
			for(int j=i+1;j<s.length();j++)
			{    
				if (ch[i]==ch[j]&&ch[i]!=' ')
				{
					freq[i]++;
					ch[j]='0';
				}
				
			}
		}
		for(int i=0;i<s.length();i++)
		{ 
			if(ch[i]!=' '&& ch[i]!='0')
			System.out.println("Frequency of "+ch[i]+"charecter is "+freq[i]);
		}
		Arrays.sort(freq);
	
			System.out.println("Second largest frequency is " +freq[freq.length-2]);
		
	}

}
