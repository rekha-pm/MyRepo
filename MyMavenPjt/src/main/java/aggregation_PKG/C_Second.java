package aggregation_PKG;

public class C_Second {
	
	String name;
	int age;
	P_Second ref;
	
	public C_Second(int age,String name,P_Second ref) {
		this.name = name;
		this.age=age;
		this.ref=ref;
	}
	
	public void display() {
		System.out.println("name -"+name);
		System.out.println("Age -"+age);
		System.out.println("state -"+ref.state);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Second obj1 = new P_Second(123,"Kerala");
		
		C_Second obj2 = new C_Second(55,"Malini",obj1);
		
		obj2.display();
}
}
