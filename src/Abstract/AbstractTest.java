package Abstract;

public class AbstractTest extends abstra
{
public void display1()
{
	System.out.println("This is a abstract method defined");

}
public static void main (String args[])
{
	AbstractTest ob= new AbstractTest();
	ob.display();
	ob.display1();
}
}
