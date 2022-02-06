package interface1;

public class Rectangle {
	public void draw()
	{
		System.out.println("abstract method");
	}
	public void display()
	{
		System.out.println("instance method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob=new Rectangle();
		ob.draw();
		ob.display();
		
	}

}
