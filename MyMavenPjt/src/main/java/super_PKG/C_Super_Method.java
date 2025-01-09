package super_PKG;

public class C_Super_Method extends P_Super_Method{
	
	public void display()
	{
	System.out.println("This is first Child method");
	super.display();
	super.show();
	this.show();
	}
    
	public void show()
	{
	System.out.println("This is second Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_Super_Method obj = new C_Super_Method();
		obj.display();
		obj.show();

	}

}
