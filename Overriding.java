
class A
{
	public int sum(int a,int b)
	{
		return(a+b);
	}
}
class B extends A
{
	public int sum(int a,int b)
	{
		return(a+b+7);
	}
}

public class Overriding {

	public static void main(String[] args) {
		B obj=new B();
		System.out.println(+obj.sum(7,8));	

	}

}
