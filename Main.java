import java.util.Scanner;

public class Main {
	
	public static int choice = 0;
	//public means declared outside of main()?

	
	public static void main (String[] args) {

		final int START = 1;
		final int GUIDE = 2;
		final int QUIT = 3;
		
		String setting = "";

				
		Scanner in = new Scanner(System.in);

		RoomGenerator R = new RoomGenerator();
		EventGenerator E = new EventGenerator();
		//R.RoomGenerate();
		
	//WORKS! Now just clean up!
		//Put this on github!
	
		do {
			System.out.println("Welcome!");
			System.out.println("1: Start the game");
			System.out.println("2: Guide");
			System.out.println("3. Quit");
			System.out.println("Please choose an option");
			
			choice = in.nextInt();
			
			switch (choice) {
			
			case START:
			
//				E.eventGenerate();
				
				System.out.println("Welcome to _____");
				System.out.println("");
				System.out.println("Character Creation");
				System.out.println("___________________");
				Player player = new Player(5, 1, 1, 1);
				player.setLevelHelp();
				System.out.println("___________________");
				player.getLevel();
				System.out.println("You may level up five times");
				player.levelUp();
				player.levelUp();
				player.levelUp();
				player.levelUp();
				player.levelUp();
				System.out.println("You are now ready to begin your journey. . .");

				R.RoomGenerate();
				E.eventGenerate();

				
				
//				
//			E.testing();
//			E.testing();
//			E.testing();
//			E.testing();
//			E.testing();
			
				


				
				//R.RoomGenerate();
//				E.eventGenerate();
				
				
				
				
				
			break;
			
			case GUIDE:
				System.out.println("Guide");
				
				
				break;
				
			case QUIT:
				System.out.println("Quitting from program");
				break;
	
				
			default: 	
				System.out.println("Incorrect choice, Please choose again");
				
			}
			
		}
		
		while(choice != QUIT);
	
		
		
		
	}
	
}
