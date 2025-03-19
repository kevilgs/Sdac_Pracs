package q1;


//REAL TIME EXAMPLE OF STATIC VARIABLE AND STATIC METHOD


class Emp {

	static String companyname= "WE";
	static String dept ="Logistics";
	String name;
	int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	void displayInfo() {

		System.out.println(name);
		System.out.println(id);
	}

	static void displayInfo2() {

		System.out.println(Emp.companyname);
		System.out.println(Emp.dept);

	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Kevil",12);
		emp.displayInfo();
		Emp.displayInfo2();
		
	}
}
