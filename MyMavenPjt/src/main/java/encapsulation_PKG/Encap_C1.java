package encapsulation_PKG;

public class Encap_C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap_P1 obj = new 	Encap_P1();
		obj.setuName("Rekha");
		obj.setpWD("123");
		
		System.out.println("User Name is :"+obj.getuName());
		System.out.println("Password is :"+obj.getpWD());
	}

}
