package accessmodifier;

public class Pub  extends Prot{
	public void dis()
	{
		System.out.println("public class");
	}

	public static void main(String[] args) {
		Prot ob=new Prot();
		ob.display();
		Pub obj=new Pub();
		obj.dis();

	}

}
