
public class LL {
	Node head;
	Node currentnode;
	Node secondlast;
	Node last;
	int size=0;
	class Node
	{
		String data;
		Node next;
		
		/*Node(String data)
		{
			this.data=data;
			this.next=null;
			size++;
		}*/
	}
	//addFirst
	public void AddFirst(String data)
	{
		Node newnode=new Node();
		if(head==null)
		{
			head=newnode;
			return;
		}
		
		newnode.next=head;
		head=newnode;
	}
	//addLast
	public void AddLast(String data)
	{
		Node newnode=new Node();
		if(head==null)
		{
			head=newnode;
			return;
		}
		currentnode=head;
		while(currentnode.next!=null)
		{
			currentnode=currentnode.next;
		}
		currentnode.next=newnode;
		
		
	}
	//print
	public void print()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		currentnode=head;
		while(currentnode!=null)
		{
			System.out.print(currentnode.data+"->");
			currentnode=currentnode.next;
		}
		System.out.println("Null");
	}
	//delete first
	public void RemoveFirst()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		head=head.next;
		size--;
		
	}
	//delete last
	public void RemoveLast()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		size--;
		if(head.next==null)
		{
			head=null;
			return;
		}
		secondlast=head;
		last=head.next;
		while(last.next!=null)
		{
			last=last.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}
	public void getSize()
	{
		System.out.println("Size is "+size);
	}
	
	public static void main(String[] args) {
		LL list=new LL();
		list.AddFirst("a");
		list.AddFirst("is");
		list.AddLast("Linked list");
		list.AddFirst("This");
		list.print();
        list.RemoveLast();
        list.print();
        list.getSize();
        list.AddLast("Linked List");
        list.print();
        list.getSize();
        
	}

}
