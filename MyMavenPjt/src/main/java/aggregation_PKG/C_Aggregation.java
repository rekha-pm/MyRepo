package aggregation_PKG;

public class C_Aggregation {
	
	int rollnum;
	String subject;
	P_Aggregation ref;
	
	
	public C_Aggregation(int rollnum,String subject,P_Aggregation ref) {
	this.rollnum = rollnum;
	this.subject = subject;
	this.ref = ref;
		
	}
	
	public void display() {
		
		System.out.println("RollNum : " +this.rollnum);
		
		System.out.println("Subject : " +this.subject);
	
		System.out.println("Name :" +ref.name);
		
		System.out.println("Age :" +ref.age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Aggregation obj1 = new P_Aggregation(21,"Aamy");
		C_Aggregation obj2 = new C_Aggregation(10,"Maths",obj1);
		obj2.display();
	}

}
