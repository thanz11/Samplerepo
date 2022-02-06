
public class Dev extends Emp {
	float bonus=40000;
	public void display()
	{
	System.out.println("Salary="     +salary);
	System.out.println("bonus="      +bonus);
	}

	public static void main(String[] args)
	{
		
		Dev ob=new Dev();
		ob.display();

	}

}
