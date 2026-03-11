package UIK;

public class Operation {
public static void main(String[] args) {
	String ch = "-";
	int num1 = 3;
	int num2 = 5;
	switch(ch) {
	
	case "+":
		System.out.println("Addition Is " + (num1 + num2));
		break;
		
	case "-":
		System.out.println("Subtraction Is " + (num1 - num2));
		break;
		
	case "*":
		System.out.println("Multiplication Is " + (num1 * num2));
		break;
		
	case "/":
		System.out.println("Division Is " + (num1 / num2));	
		break;
		
	default:
		System.out.println("Invalid Input");
			
	}
	
}
}
