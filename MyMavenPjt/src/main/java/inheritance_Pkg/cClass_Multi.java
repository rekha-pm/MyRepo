package inheritance_Pkg;

//import multiLevel_Inheritance.childClass_Multi;

public class cClass_Multi extends iClass_Multi{
	
	public void display_C ()
	{
	 System.out.println("Child Class method - Multiple Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cClass_Multi obj = new cClass_Multi();
		obj.display_C();
		obj.display_I();
		obj.display_P();
		
		

	}

}
