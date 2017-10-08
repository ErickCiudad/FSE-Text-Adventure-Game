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
		R.RoomGenerate();
		
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
				int input;
				int levelUpPoints = 5;
				int health = 3;
				int strength = 1;
				int dexterity = 1;
				int intelligence = 1;
				
				System.out.println("Welcome to _____");
				System.out.println("");
				System.out.println("Character Creation");
				System.out.println("___________________");
				System.out.println("You have " + levelUpPoints + " level up points to spend");
				
				System.out.println("Health: " + health);
				System.out.println("Strength: " + strength);
				System.out.println("Dexterity: " + dexterity);
				System.out.println("Intelligence: " + intelligence);

				input = in.nextInt();
				strength = strength + input;

				
				
				
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
