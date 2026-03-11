package UIK;

public class Grade {
	public static void main(String[] args) {
		char grade = '6';
		switch (grade) {

		case '1':
			System.out.println("Excellent");
			break;
		case '2':
			System.out.println("Good");
			break;
		case '3':
			System.out.println("Average");
			break;
		case '4':
			System.out.println("Pass");
			break;
		case '5':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
