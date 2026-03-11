package UIK;

public class Evenodd {
	public static void main(String[] args) {
		int num = 4;
		switch(num % 2) {
		
		case 0:
			System.out.println( num + " Is Even");
			break;
			
		case 1:
			System.out.println(num + " Is Odd");
			break;
			
			default:
				System.out.println("Invalid No");
		}
	}

}
