import java.util.*; 
abstract class Shapes
{
	
	Scanner sc=new Scanner(System.in);
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println("The area is: "+area);
	}
	
}
 class Circle extends Shapes
 {   private final double pi=3.14678;
     private double r;

	void collect() {
		System.out.println("Enter the radius ");
		r=sc.nextDouble();
		
	}

	void calculate() {
		area=pi*r*r;
		
	}
	 
 }
 class Rectangle extends Shapes
 {
     private double l;
     private double b;
	void collect() {
		System.out.println("Enter the value of length");
		l=sc.nextDouble();
		System.out.println("Enter the value of breadth");
		b=sc.nextDouble();
	}

	void calculate() {
		area=l*b;
		
	}
	 
 }
 class Square extends Shapes
 {
      private double side;
	void collect() {
		System.out.println("Enter the value of side");
		side=sc.nextDouble();
		
	}

	void calculate() {
		area=side*side;
		
	}
	 
 }
 class Geometry
 {
	 void permit(Shapes s)
	 {
		 s.collect();
		 s.calculate();
		 s.display();
	 }
 }
public class Oops_properties {

	public static void main(String[] args) {
	Geometry g =new Geometry();
	Rectangle r=new Rectangle();
	Square s=new Square();
	Circle c=new Circle();
	g.permit(c);
	System.out.println("--------------------------------");
	g.permit(s);
	System.out.println("--------------------------------");
	g.permit(r);
	System.out.println("--------------------------------");

	

	}

}
