package xyz;

public class ReversedNo {

	// Parameterized without Return Type

	public void s1(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
			System.out.println("Reversed No = " + reversed);
		}
	}

	// Non-Parameterized without Return Type

//	public void s2 () {
//		int num = 3547;
//		int reversed = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num / 10;
//			System.out.println("Reversed No = " + reversed);
//		}
//	}

	// Parameterized with Return Type

//	public String s3(int num) {
//		int reversed = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num / 10;
//
//		}
//		return ("Reversed No = " + reversed);
//	}
	
	
	// Non-Parameterized with Return Type
	
//	public String s4 () {
//		int num = 3547;
//		int reversed = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num / 10;
//			}
//         return ("Reversed No = " + reversed);
//}
}
