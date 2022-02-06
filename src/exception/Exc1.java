package exception;

public class Exc1
{
public void display()
{
	int a=10;
	int b=a/0;
	System.out.println(b);
}
public static void main(String args[])
{
	Exc1 ob=new Exc1();
	//System.out.println("statement");// after this statement exception  occurs
	ob.display();
	System.out.println("statement");   //will not execute coz,before the statemnt exception occurs

}
}
