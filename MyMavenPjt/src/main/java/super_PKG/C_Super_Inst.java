package super_PKG;

public class C_Super_Inst extends P_Super_Inst{
	
	String color = "Red_C";
	
	public void display()
	{
		
	System.out.println("C Colour is : " +color);
	System.out.println("P Colour is : " +super.color);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_Super_Inst obj = new C_Super_Inst();
		obj.display();
		

	}

}
