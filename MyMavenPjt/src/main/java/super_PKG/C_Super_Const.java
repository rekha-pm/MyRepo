package super_PKG;

public class C_Super_Const extends P_Super_Const{
	
	public C_Super_Const() {
		super();
	    System.out.println("This is first child constructor");
	
	}
	
	public C_Super_Const(int a) {		
		super(2,3);
		System.out.println("This is second child constructor.New vble is " +a);
	
	}
	
	public C_Super_Const(int a,int b) {		
	    this();
		System.out.println("This is third child constructor.New vbls are " +a +" and " +b);
	
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C_Super_Const obj1 =new C_Super_Const();
		C_Super_Const obj2 =new C_Super_Const(2);
		C_Super_Const obj3 =new C_Super_Const(2,3);
	}

}
