package access_PKG;

public class AccessClass {
	
	private void pri_method() {
		System.out.println("This is a Private method");
	}
	
	public void pub_method() {
		System.out.println("This is a Public method");
	}
	
	
	protected void pro_method() {
		System.out.println("This is a Protected method");
	}
	
	
	 void def_method() {
		System.out.println("This is a Default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessClass obj = new AccessClass();
	
		obj.pri_method();
		obj.pub_method();
		obj.pro_method();
		obj.def_method();
	}

}
