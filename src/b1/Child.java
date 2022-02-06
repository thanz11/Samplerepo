package b1;

public class Child extends Parent 
{
	public void add()
	{
		int c=a+b;
		System.out.println("sum="+c);
	}
	public void sub()
	{
	int f=40;
	int h=30;
	int g=f-h;
	System.out.println("sub="+g);
	
	}
	
public static void main(String args[]) 
{
Child ob=new Child();
ob.display();
ob.sub();
ob.add();
}

}
