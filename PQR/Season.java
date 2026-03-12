package PQR;

public class Season {
	public static void main(String[] args) {
		String  month = "Dec";
		switch(month) {
		
		case "Dec", "Jan", "Feb":
			System.out.println("Winter");
		break;
		
		case "Mar", "April", "May":
			System.out.println("Summer");
		break;
		
		case "June", "July", "Augest":
			System.out.println("Monsoon");
		
		case "Sep", "Oct", "Nov":
			System.out.println("Autumn");
		break;
		
		default:
			System.out.println("Cloudy");
		
		}
	}

}
