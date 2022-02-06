package student_details;

public class Address 
{
	
String addres;

public void addr(String addres)
{
	System.out.println("enter the house name of the student"+addres);
	
}
public static void main(String args[])
{
	Student ob=new Student();
	ob.detail("anu",8);
	Address obj=new Address();
	obj.addr("doulath manzil");
}
}