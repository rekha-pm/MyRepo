package super_PKG;

public class P_Super_Const {

	public P_Super_Const() {

		System.out.println("This is first parent constructor");
	}

	public P_Super_Const(int a, int b) {
		int c = a + b;
		System.out.println("This is second parent constructor.Sum = " + c);
	}

}
