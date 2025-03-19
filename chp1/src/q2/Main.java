package q2;


class Emp{
	
	String name;
	double sal;
	static String dept;
	static String companyname;
	
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(sal);
	}
	
	static void displayInfo2() {
		System.out.println(Emp.companyname);
		System.out.println(Emp.dept);
	}
}





public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayInfo();
		Emp.displayInfo2();

	}
}
