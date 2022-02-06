package overriding;

import accessmodifier.Prot;
import accessmodifier.Pub;

public class Child extends Parent
{
public static void display(int rollno)
{
	System.out.println("ROLL NO is "+rollno );
}
public static void main(String[] args) 
{
	Parent ob=new Parent();
	ob.display("ANU");
	Child obj=new Child();
	obj.display(20);
}
}