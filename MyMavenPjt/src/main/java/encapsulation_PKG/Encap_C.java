package encapsulation_PKG;

public class Encap_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap_P obj1 = new Encap_P();
		obj1.setAge(25);
		obj1.setName("Ahaan");
		
		System.out.println("Age:"+obj1.getAge());
		System.out.println("Name:"+obj1.getName());
	}

}
