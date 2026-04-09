
public class Armstrong {
	public static void main(String[] args) {
		int a = 567,
		number,remainder, result = 0;
		number = a;
		while(number!=0)
		{
			remainder = number % 10;
			result += Math.pow(remainder, 3);
			number /=10;
		}
		if(result == a)
			System.out.println("Is an Armstrong Number");
	else  
		System.out.println("Is Not Armstrong Number");
	
	}
}
