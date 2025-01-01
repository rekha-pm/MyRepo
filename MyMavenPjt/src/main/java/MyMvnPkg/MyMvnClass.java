package MyMvnPkg;

public class MyMvnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// Append - to add a new staring at the end
		sb.append("hi");
		System.out.println(sb);
		
		//Insert - to add at a particular index
		sb.insert(6, "hey");
		System.out.println(sb);
		
		//Replace
		sb.replace(5,10,"Java");
		System.out.println(sb);
		
		//Reverse
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//Delete
		sb.delete(6, 11);
		System.out.println(sb);
	}

	}


