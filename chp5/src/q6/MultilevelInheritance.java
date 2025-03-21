package q6;

class Account {

	double calSal(double sal) {

		return sal;
	}

	double calSal(double sal, double bonus) {

		return sal + bonus;
	}
}

class Projectmanager extends Account {

	@Override
	double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calSal(sal, bonus);
	}

}

class Employee extends Account {

	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Projectmanager projectmanager = new Projectmanager();
		System.out.println("Salary of Manager is " + "" + projectmanager.calSal(1000, 300) );
		
		Employee employee = new Employee();
		System.out.println("Salary of Employee is " + "" + employee.calSal(1000) );

	}
}
