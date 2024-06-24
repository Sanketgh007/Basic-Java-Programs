import java.util.LinkedList;

public class Lkdlst {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		
		l.addFirst(1);
		 System.out.println(l);
		l.addLast(10);
		 System.out.println(l);
		l.push(7);
		 System.out.println(l);
		l.push(8);
		 System.out.println(l);
		l.pop();
		 System.out.println(l);
		l.offer(3);
		 System.out.println(l);
		System.out.println(l.peek());
		
	         l.poll();
	         System.out.println(l);

	}
}
