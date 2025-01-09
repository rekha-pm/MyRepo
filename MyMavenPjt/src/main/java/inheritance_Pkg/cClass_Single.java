package inheritance_Pkg;

public class cClass_Single extends pClass_Single{
	
	public void display_C()
	{
	System.out.println("Child Class method - Single Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cClass_Single obj = new cClass_Single();
		obj.display_C();
		obj.display_P();

	}

}
