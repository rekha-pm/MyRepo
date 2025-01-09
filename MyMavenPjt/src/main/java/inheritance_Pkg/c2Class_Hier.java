package inheritance_Pkg;

public class c2Class_Hier extends pClass_Hier{
	
	public void display_C2 ()
	{
	 System.out.println("Child2 Class method - Hier Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c2Class_Hier obj = new c2Class_Hier();
		obj.display_C2();
		obj.display_P();

	}

}
