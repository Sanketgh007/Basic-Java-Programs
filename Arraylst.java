import java.util.ArrayList;
public class Arraylst {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("San");
		al.add("man");
		System.out.println(al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Sank");
		al2.add("Ram");
		al.addAll(al2);
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al.containsAll(al2));
		
	}

}

