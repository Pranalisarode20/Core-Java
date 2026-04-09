package xyz;

public class Appcheck {
	public static void main(String[] args) {
		Instagram insta = new Instagram();
		
		System.out.println("Instagram Users.....!");
			insta.loginAuto();
			insta.logout();
			insta.addStory();
			insta.createPost();
			
			System.out.println("________________________________");
			
			Whatsapp add = new Whatsapp();
			System.out.println("Whatsapp Users....!");
			add.loginAuto();
			add.logout();
			add.myStatus();
			add.chatting();
			
			System.out.println("________________________________");

			
			Facebook book = new Facebook();
			System.out.println("FaceBook User...!");
			book.loginAuto();
			book.logout();
			book.marketPlace();
			book.scrollReels();
			
			
		
	}

}
