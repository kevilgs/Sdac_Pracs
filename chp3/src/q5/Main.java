package q5;
// local static global variable

class Emp {
	
	String name="Kevil";
	static String dept="Finance";
	
	void info() {
		int id=10;
		System.out.println(id);
	}
}



public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.name);
		System.out.println(Emp.dept);
		emp.info();
	}
}
