package abstract_PKG;

public class C_Abstract extends P_Abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Abstract obj = new C_Abstract();
		obj.display();
		obj.display1();
		obj.display2();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("This is first abstract parent method");	
	}
	
	void display2()
	{
		System.out.println("This is non abstract child method");	
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is second abstract parent method");
	}
}
