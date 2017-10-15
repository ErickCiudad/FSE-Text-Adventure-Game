import java.util.Scanner;

public class Main {
	
	public static int choice = 0;
	public static boolean gameStatus;
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
			gameStatus = true;
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
				Player player = new Player(1, 1, 1, 1);//3
				player.setLevelHelp();
				System.out.println("___________________");
				player.getLevel();
				System.out.println("You may level up five times");
//				player.levelUp();
//				player.levelUp();
//				player.levelUp();
//				player.levelUp();
//				player.levelUp();
				System.out.println("You are now ready to begin your journey. . .");

				for (int i = 0; i <= 20; i++) {
					
				if(gameStatus)	{
					
				R.RoomGenerate();
				E.eventGenerate();
					
				if(i == 20) {
					System.out.println("You have completed your journey! It was long and arduous, and now you are done!");
					}
				
					}
				
				}
				

				
			break;
			
			case GUIDE:
				System.out.println("Guide");
				System.out.println("___________________");
				System.out.println("");
				System.out.println("Basics:");
				System.out.println("The game will have twenty random rooms, each with random events.");
				System.out.println("In order to beat the game, you must survive until the end of all twenty rooms");
				System.out.println("Your choices will either benefit or hurt you");
				System.out.println("");
				System.out.println("Combat:");
				System.out.println("You may either fight the enemy you face or flee");
				System.out.println("Fleeing is a 50% chance of getting away, and a 50% chance of not being able to escape and fighting");
				System.out.println("When you do fight, your health becomes your battle health, and your damage becomes a number based on your stats and the type of the enemy you are fighting");
				System.out.println("Physical enemies can only be damaged with the number that is your strength");
				System.out.println("Ranged enemies can only be damaged with the number that is your dexterity");
				System.out.println("Magical enemies can only be damaged with the number that is your intelligence");
				System.out.println("\"All\" type enemies are damaged with the number of the sum of your strength, dexterity, and intelligence");
				System.out.println("During an attack, both of your healths are subtracted by eachothers damages");
				System.out.println("Know when an enemy is defeatable, and destroy them with your superior stats");
				System.out.println("Likewise, know when an enemy is undefeatable, and use what chance you have to flee");
				System.out.println("");
				System.out.println("Events:");
				System.out.println("Events are practically broken up into 50% good and 50% bad");
				System.out.println("It is wise to be riskier when your stats are higher, and safer when your stats are lower");
				System.out.println("However, when you need it, an event could be a critical help for you. It all comes down to the gambles you make in each playthrough");
				System.out.println("___________________");
				System.out.println("");

				
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
