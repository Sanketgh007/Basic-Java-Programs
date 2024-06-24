package circular_queue_operation;

import java.util.Scanner;


public class circular_queue_operation {
	Scanner s=new Scanner(System.in);
	 int rear=-1,front=0,ele;
	int q[]=new int[10];
	int count=0;
	int size=10;
	 void insert()
	 {
		 if(count==size)
			 
		 {
			 System.out.println("Circular queue is full");
			 
		 }
		 else
		 {   System.out.println("Enter the element to insert:");
		      ele=s.nextInt();
			 rear=(rear+1)%size;
			 q[rear]=ele;
			 count++;
			 
		 }
		 
	 }
	 void delete()
	 {
		 if(count==0)
		 {
			 System.out.println("Circular queue is emmpty");
		 }
		 else
		 {
			ele=q[front];
			front=(front+1)%size;
			count--;
			System.out.println("Deleted element is "+ele);
		 }
	 }
	 void display()
	 {
		 if(count==0)
		 {
			 System.out.println("Circular queue is emmpty");
		 }
		 else
		 {
			 System.out.println("Elements in the circular queue are  : ");
			 for(int i=1,f=front;i<=count;i++)
			 {
				 System.out.println(q[f]);
				 f=(f+1)%size;
			 }
		 }
	 }
		 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Queue Operation");
		circular_queue_operation qo=new circular_queue_operation();
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

}}
