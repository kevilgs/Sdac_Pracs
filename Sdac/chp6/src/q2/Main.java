package q2;

import q2.personnel.Emp;
import q2.personnel.Manager;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("manager salary:"+ " "+ manager.calSal(1200000, 30000));
		
		
		Emp emp = new Emp(); 
		System.out.println("Employee salary:"+ " "+ emp.calSal(1000));
	}
}
