package q6;


class Acc {
	
	double calSal(double sal) {
		
		return sal;
	}
}

class Manager extends Acc {
	
	void assignWork() {
		System.out.println("Work Assigned to employeee");
	}
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
	
}


public class SingleInheritance {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("Single inheritance.. manger directly inherited properties of Acc class");
		System.out.println(manager.calSal(2000));
	}
}
