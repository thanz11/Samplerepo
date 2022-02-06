package multilivel;

public class C2 implements C1
{
	public void print()
	{
		System.out.println("Interface 1");
	}
		public void display()
		{
			System.out.println("Interface 2");
		}
		public static void main (String args[])
		{
			C1 ob =new C2();
			ob.display();
			ob.print();
		}
	}

	
	