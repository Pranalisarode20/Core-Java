package PQR;

public class Operation {
	public static void main(String[] args) {
		char ch = '+';
		switch (ch) {
		
		case '+':
		System.out.println("Addition");
		break;
		
		case '-':
			System.out.println("Substraction");
			break;
			
		case '*':
			System.out.println("Multiplication");
			break;
			
		case '/':
			System.out.println("Division");
			break;
			
		default:
			System.out.println("Invalid Operator");
		
		}
		
	}

}
