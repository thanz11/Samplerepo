package multipleinheritance;

public class SampleConnect implements Sample ,Sample2 {

	public void print()

	{
System.out.println("Interface 1");		
	}
	public void show()

	{
System.out.println("Interface 2");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleConnect c= new SampleConnect();
c.show();
c.print();
	}

}
