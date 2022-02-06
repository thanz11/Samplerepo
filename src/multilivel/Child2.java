package multilivel;

public class Child2 extends Child1 {
	public void mul()
	{
		int f=a*b;
		System.out.println("mul="+f);
	}
	public static void main(String args[])
	{
		Child2 ob=new Child2();
		ob.sub();
		ob.mul();
		ob.display();
	}
}