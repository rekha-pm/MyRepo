package inheritance_Pkg;

public class c1Class_Hier extends pClass_Hier{
	
	public void display_C1 ()
	{
	 System.out.println("Child1 Class method - Hier Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1Class_Hier obj = new c1Class_Hier();
		obj.display_C1();
		obj.display_P();

	}

}
