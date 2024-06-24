import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
		char u='*';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        StringBuffer md =new StringBuffer();
        for(int i=0;i<=s.length()-1;i++)
        {   
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    
        	{
        		md.append('*');
                
        	}
        	else
        	{
        		md.append(s.charAt(i));
        	}
        }
        System.out.println(md);
	}
}


	


