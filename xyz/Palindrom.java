package xyz;

public class Palindrom {
	
	// Parameterized without Return Type
	
	public void a1(int num) {
		int reversed = 0;
		int original = num;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		if(original == reversed) {
			System.out.println( reversed + " No Is Palindrom");
		}else {
			System.out.println(reversed + " No Is Not Palindrom");
		}
	}
	
	
	// Non-Parameterized without Return Type
	
//	public void a2() {
//		int num = 121;
//		int reversed = 0;
//		int original = num;
//		while (num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num =num / 10;
//		}
//		if(original == reversed) {
//			System.out.println( reversed + " NO Is  Palindrom ");
//		}else {
//		System.out.println(reversed + " No Is NOt Palindrom");	
//		}
//	}
//	
	
	// Parameterized with Return Type
	
//	public String a3(int num) {
//		int reversed = 0;
//		int original = num;
//		while( num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num / 10;
//		}
//		if(original == reversed) {
//			return (reversed + " No Is Palindrom");
//		}
//		return (reversed + " No Is Not Palindrom");
//	}
	
	
	// Non-Parameterized with Return Type
	
//	public String a4() {
//		int num = 123;
//		int reversed = 0;
//		int original = num;
//		while ( num != 0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reversed) {
//			return (reversed + " No Is Palindrom");
//		}
//		return ( reversed + " No Is Not Palimdrom");
//	}

}
