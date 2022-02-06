package single;

public class Subclass extends Base 
{
public void sub()
{
	int d=a-b;
	System.out.println("sub is ="+d);
	}
public static void main (String args[])
{
	Subclass ob=new Subclass();
	ob.sum();
	ob.sub();
	}
}
