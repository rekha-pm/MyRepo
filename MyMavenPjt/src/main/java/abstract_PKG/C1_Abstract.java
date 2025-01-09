package abstract_PKG;

public class C1_Abstract extends P1_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1_Abstract obj1 = new C1_Abstract();  //this is not object creation.This is Ref creation
		obj1.show_PA();
		obj1.show_P();
		//obj1.show_C();  //can't call child methods using reference
		
		//For calling child class method,we need to use object of child class.All methods can be called using child class objects
		C1_Abstract obj2 = new C1_Abstract();
		obj2.show_C();
		obj2.show_P();
		obj2.show_PA();
	}

	@Override
	public void show_PA() {
		// TODO Auto-generated method stub
		System.out.println("This is Parent Abstract method");
	}
	
	public void show_C() {
		System.out.println("This is Child Non-Abstract method");
	}

}
