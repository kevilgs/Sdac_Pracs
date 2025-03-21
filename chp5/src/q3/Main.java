// Dynamic Method Dispatch

package q3;

class RBI {
	
	float rateOfIntrest() {
		return 0.0f;
	}
}

class SBI extends RBI {
	@Override
	float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 8.6f;
	}
	
}

class Axis extends RBI {
	
	@Override
	float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 8.9f;
	}
}

class BOB extends RBI {
	
	@Override
	float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 7.9f;
	}
}

public class Main {
	public static void main(String[] args) {
		RBI r;
		r = new Axis(); // Upcasting
		System.out.println("Rate of Intrest for "+ r.getClass().getSimpleName()+ " is " + r.rateOfIntrest());
		r = new SBI();
		System.out.println("Rate of Intrest for "+ r.getClass().getSimpleName()+ " is " + r.rateOfIntrest());
		r = new BOB();
		System.out.println("Rate of Intrest for "+ r.getClass().getSimpleName()+ " is " + r.rateOfIntrest());
		
	}

}
