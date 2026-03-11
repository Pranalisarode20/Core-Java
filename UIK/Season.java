package UIK;

public class Season {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		
		case 12:
		case 1:
		case 2:
			System.out.println("Winter Season");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("Summer Season");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("Mansoon Season");
			break;
			
			default:
				System.out.println("Invalid");
		}
	}

}
