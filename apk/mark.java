package apk;

public class mark {
	public static void main(String[] args) {
		int mark = 75;
			if(mark >= 75 && mark < 100)
			{
				System.out.println("Distinction");
			}else if(mark >= 60 && mark < 75)
			{
				System.out.println("First class");
			}else if(mark >= 50 && mark < 60)
			{
				System.out.println("second class");
			}else if( mark >= 35 && mark < 100)
			{
				System.out.println("Pass");
			}else {
				System.out.println("Fail...");
			}
	}

}
