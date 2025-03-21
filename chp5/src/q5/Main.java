// SUPER KEYWORD

package q5;

class Acc {
	
	double calSal(double sal) {
		return sal;
	}
	
}

class Emp extends Acc{
	
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.calSal(2000));
	}
}
