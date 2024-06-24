import java.util.*;
public class Stack_operation {
	int top=-1,top1=-1,n=10;
	int stack[]=new int[10];
	int ele;
	Scanner sc=new Scanner(System.in);
	void push()
	{	
		if(top==(n-1))
		{
			System.out.println("Stack is full");	
		}
		else
		{
			System.out.println("Enter the element to push");
			ele=sc.nextInt();
			stack[++top]=ele;	
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");	
		}
		else
		{
		 ele=stack[top--];
		 System.out.println("Poped element is "+ele);
			
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");	
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
             System.out.println("Elements present in the Stacks are:"+stack[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Stack Operations");
		Stack_operation so=new Stack_operation();
		Scanner sc=new Scanner(System.in);
;		for(;;)
		{    System.out.println("Menu");
			System.out.println("\n1.Push\n2.Pop\n3.display");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:so.push();
			break;
			case 2:so.pop();
			break;
			case 3:so.display();
			break;
			}
		}

	}

}
