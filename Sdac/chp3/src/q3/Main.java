package q3;


// EXAMPLE OF OVERLOADING AD OVERIDING




class Acc{
	
	double calSal(double sal) {
		
		return sal;
	}
	
	double calSal(double sal, double bonus) {
		
		return sal+bonus;
	}
	
	double calSal(double sal, double bonus, double tax) {
		
		return sal+bonus+tax;
	}
	
}

class Manager extends Acc{
	
	@Override
	double calSal(double sal) {
		// TODO Auto-generated method stub
		return super.calSal(sal);
	}
}






public class Main {
	public static void main(String[] args) {
		
		Acc acc = new Acc();
		System.out.println(acc.calSal(100));
		System.out.println(acc.calSal(100, 200));
		
		Manager manager = new Manager();
		System.out.println(manager.calSal(1000));

	}
}
