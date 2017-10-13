import java.util.Scanner;

public class Player {

	public static int health;
	public static int strength;
	public static int dexterity;
	public static int intelligence;
	public static int allDamage;
	public static int battleHealth;
	public static Scanner in = new Scanner(System.in);
	
	public Player(int health, int strength, int dexterity, int intelligence) {
		this.health = health;
		this.battleHealth = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public static void setLevelHelp() {
		System.out.println("Health: Allows you to take damage and lowers odds of being defeated");
		System.out.println("Strength: Increases attack damage, makes you more capable of physical feats");
		System.out.println("Dexterity: Increases ranged attack damage, makes you more capable of acrobatic feats");
		System.out.println("Intelligence: Increases magical attack damage, makes you more capable of intellectual feats");
	}
	
	public static void levelUp() {
		getLevel();
		System.out.println("Which would you like to level up? (1)Health, (2)Strength, (3)Dexterity, (4)Intelligence, (Any other number)Help");
		int levelChoice = in.nextInt();
		//use input validation
			
		switch(levelChoice) {
			case 1 :
				health++;
				battleHealth = health;
				getLevel();
				break;
			case 2:
				strength++;
				getLevel();
				break;
			case 3:
				dexterity++;
				getLevel();
				break;
			case 4:
				intelligence++;
				getLevel();
				break;
			default:
				setLevelHelp();
				levelUp();
				break;
		}
			
	}
	
	public static void getLevel() {		
		
		allDamage = strength + dexterity + intelligence;
		
		if(health < 0) {health = 0;}//gameOver has yet to be built
		if(strength < 0) {strength = 0;}
		if(dexterity < 0) {dexterity = 0;}
		if(intelligence < 0) {intelligence = 0;}
		
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("___________________");
	}

}
