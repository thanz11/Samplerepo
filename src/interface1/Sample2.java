package interface1;

public class Sample2 implements Sample1{
	public void print()
	{
		System.out.println("its implementing");
	}
	public void add() {
		int c=a+b;
		System.out.println("sum is +c");
	}
public void display()
{
	System.out.println("this is the method in child class");
}

public static void main(String args[]) {
	

Sample2 ob=new Sample2();
ob.add();
ob.print();
ob.display();
System.out.println(ob.a);
System.out.println(ob.b);

}
}