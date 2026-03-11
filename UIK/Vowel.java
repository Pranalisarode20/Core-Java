package UIK;

public class Vowel {
	public static void main(String[] args) {
		char ch = 'a';
		switch(ch) {
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println(ch + " This Is Vowel");
		break;
		
		default:
			System.out.println(ch + " This Is Consonant");
		}
	}

}
