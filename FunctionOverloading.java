package FunctionOverloading;

public class FunctionOverloading {
	public int sum(int a, int b)
	{
		return(a+b);
	}
	
	public double sum(double a,double b,double c)
	{
		return(a+b+c);
	}

	public static void main(String[] args) {
		FunctionOverloading fv=new FunctionOverloading();
		System.out.println("The sum is "+(fv.sum(10, 20)));
		System.out.println("The sum is "+(fv.sum(5, 5)));
		System.out.println("The sum is "+(fv.sum(10, 20,1.5)));		

	}

}
