package q6;

class Accounts {

	double calSal(double sal) {

		return sal;
	}

	double calSal(double sal, double bonus) {

		return sal + bonus;
	}
}

class Supervisor extends Accounts {

	@Override
	double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calSal(sal, bonus);
	}

	void giveWork() {
		System.out.println("Work has been allotted");
	}

}

class Emp extends Supervisor {

	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}

	@Override
	void giveWork() {
		// TODO Auto-generated method stub
		System.out.println("Recieved work from Supervisor");
	}

}

public class Hierarchical {
	public static void main(String[] args) {
		Supervisor supervisor = new Supervisor();
		System.out.println(supervisor.calSal(10000, 3000));

		Emp emp = new Emp();
		emp.giveWork();
	}
}
