package UIK;

public class StudentDeparment {
	public static void main(String[] args) {
		String std = "A";
		switch (std) {

		case "A":
			System.out.println("Computer Science");
			break;

		case "B":
			System.out.println("Mechanical");
			break;

		case "C":
			System.out.println("Civil");
			break;

		case "D":
			System.out.println("Electrical");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}

}
