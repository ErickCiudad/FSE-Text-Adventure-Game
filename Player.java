
public class Player {

	int health;
	int strength;
	int dexterity;
	int intelligence;
	
	public Player(int health, int strength, int dexterity, int intelligence) {
		this.health = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	public void setLevel(int health, int strength, int dexterity, int intelligence) {
		this.health = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	
	public void getLevel() {		
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
	}

}
