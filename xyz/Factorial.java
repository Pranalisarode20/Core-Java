package xyz;

public class Factorial {
	
	// Parameterized Without Return Type
	
	public void w1(int fact) {
		for(int i = 1; i <= 5; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
	
	// Non- Parameterized Without Return Type
	
//	public void w2() {
//		int fact = 3;
//		for(int i = 1; i<=5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//	}

	// Parameterized With Return Type
	
//	public String w3(int fact) {
//		for(int i = 1; i <= 5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//		return("Factorial No = " + fact);
//	}
//	
	
	
	// Non-Parameterized With Return Type
	
//	public String w4() {
//		int fact = 3;
//		for(int i = 1; i<=5; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
//		return("Factorial No = " + fact);
//	}
	
}
