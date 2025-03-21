package q2;

// EXAMPLE OF PARAMETERISED CONSTRUCTOR

class Emp{
	
	int id;
	String name;
	String dept;
    double sal;
    
	public Emp(int id, String name, String dept, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
}





public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "Tom","Finance", 12000000);
		System.out.println(emp);
	}
}
