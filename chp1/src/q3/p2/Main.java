package q3.p2;

import q3.p1.*;

public class Main extends A {
	public static void main(String[] args) {
		 Main main = new Main();
		 System.out.println("another package");
		 System.out.println(main.b);
		 System.out.println(main.c);
		 D d = new D();
		 d.displayD();
	}

}

class D extends q3.p1.A {
	
	void displayD() {
		D d = new D();
		System.out.println("another package insude class d");
		System.out.println(d.b);
		System.out.println(d.c);
	}
}
