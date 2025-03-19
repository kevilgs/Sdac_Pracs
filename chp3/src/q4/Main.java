package q4;

//pojooo

class Emp{
	
	String name;
	String dept;
	String companyname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
}


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setName("Kevil");
		System.out.println(emp.getName());
	}
}
