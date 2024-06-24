
import java.util.*;
public class Queue_operation {
	Scanner s=new Scanner(System.in);
	 int rear=-1,front=0,ele;
	int q[]=new int[10];
	 void insert()
	{
		if(rear==q.length-1)
		{
			System.out.println("Queue is full");	
		}
		else
		{
			System.out.println("Enter the elements to insert in a queue");
			ele=s.nextInt();
			q[++rear]=ele;
		}
	}
	 void delete()
	{
		if(front>rear)
		{
			System.out.println("Queue is empty");
			
		}
		else
		{
			ele=q[front++];
			System.out.println("Deleted elemet is "+ele);
		}
	}
	 void display()
	{
		if(rear==q.length-1)
		{
			System.out.println("Queue is full");	
		}
		else
		{
			System.out.println("Elemets in the queue are : ");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(q[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Queue Operation");
		 Queue_operation qo=new Queue_operation();
		for(;;)
		{  
			System.out.println("Menu");
			System.out.println("1.Inser\n2.Delete\n3.Display");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:qo.insert();
			break;
			case 2:qo.delete();
			break;
			case 3:qo.display();
			break;
			}
		}	

	}

}
