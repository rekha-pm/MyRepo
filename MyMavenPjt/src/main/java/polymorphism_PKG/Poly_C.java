package polymorphism_PKG;

public class Poly_C extends Poly_P{
	
	public void calc(int a,int b) {
		super.calc(a, b);
		int dif = a-b;
		System.out.println("Difference is :" + dif);
	}
	
	public void calculation(int a,int b) {
		super.calculation(a, b);
		int div = a/b;
		System.out.println("Div is :" + div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Poly_C obj1 = new Poly_C();
		obj1.calc(10, 5);
		obj1.calculation(10, 5);
		
		//Poly_P obj2 = new Poly_P();
		//obj2.calc(20, 10);
	}

}
