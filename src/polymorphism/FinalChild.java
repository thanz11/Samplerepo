package polymorphism;

public class FinalChild extends FinalParent{
	public void add(int a,int b)
	{
		int h=a+b+c;
		System.out.println("sum is "+h);
	}
	public static void main(String args[])
	{
		FinalChild ob= new FinalChild();
		ob.add(20,100);
	}

}
