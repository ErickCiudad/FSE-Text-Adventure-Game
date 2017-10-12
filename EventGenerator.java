import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {

	int eventNbr;
	String potionColor;
	String potionTexture;
	
	/*TODO
	 * 
	 * potion choice
	 * 
	 * fights
	 * 
	 * roomGenerator
	 * 
	 * skillChecks
	 * 
	 * */
	
	public EventGenerator() {
		
	
		}
	
	public void eventGenerate() {
	
		eventNbr = ThreadLocalRandom.current().nextInt(1, 10 + 1);
	
			if (eventNbr == 1) {
				//10%
				//potionEvent();		
			potionEvent();
			}
			
			else if (eventNbr <= 4) {
				//30% 2 - 4
				//peopleEvent();
				peopleEvent();
			}
			
//			else if (eventNbr <= 6) {
//				//20% 5 - 6
//				//This should be enemy
//				System.out.println("Enemy");
//				fight();
//			}
			
			else {
				//40% 6-10
				//skillCheckEvent();
				System.out.println(eventNbr + "check");
				skillCheckEvent();
				
			}
		
	}
	
	public void potionEvent() {
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);

		switch (eventNbr) {
		case 1: potionColor = "black";break;
		case 2: potionColor = "sapphire";break;
		case 3: potionColor = "amber";break;
		case 4: potionColor = "emerald";break;
		case 5: potionColor = "ruby";break;
		}
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		
		switch (eventNbr) {
		case 1: potionTexture = "thick";break;
		case 2: potionTexture = "bubbly";break;
		case 3: potionTexture = "fizzy";break;
		case 4: potionTexture = "thin";break;
		case 5: potionTexture = "radiant";break;
		}
		
		
		System.out.println("You notice a small strange bottle with a " + potionTexture + ", " + potionColor + " liquid inside of it");
		
		
		
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
		
		switch (eventNbr) {
		
		case 1:
			//Good
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			
			switch (eventNbr) {
			
			case 1:
				
				System.out.println("You drink the potion, and suddenly feel vigor flowing in you. Health +1");
				Player.health++;
				Player.getLevel();

				break;
				
			case 2:
				
				System.out.println("You drink the potion, and suddenly feel your body become stronger. Strength +1");
				Player.strength++;
				Player.getLevel();

				break;
				
			case 3:
				
				System.out.println("You drink the potion, and suddenly feel your reaction time hasten. Dexterity +1");
				Player.dexterity++;
				Player.getLevel();

				break;
				
			case 4:
				
				System.out.println("You drink the potion, and suddenly feel mind become faster and easier at deducing things. Intelligence +1");
				Player.intelligence++;
				Player.getLevel();

				break;
				
			case 5:
				
				System.out.println("You drink the potion, and suddenly feel your spirit rise. This is a legendary and valuable draught. All stats +1");
				Player.intelligence++;
				Player.strength++;
				Player.dexterity++;
				Player.health++;
				Player.getLevel();

				
				break;
			
			}
			
		break;
		
		case 2:
			//Bad

	eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			
			switch (eventNbr) {
			
			case 1:
				
				System.out.println("You drink the potion, and suddenly feel vigor draining from you. Health -1");
				Player.health--;
				Player.getLevel();

				break;
				
			case 2:
				
				System.out.println("You drink the potion, and suddenly feel your body become weaker. Strength -1");
				Player.strength--;
				Player.getLevel();

				break;
				
			case 3:
				
				System.out.println("You drink the potion, and suddenly feel your reaction time slow, you become sluggish. Dexterity -1");
				Player.dexterity--;
				Player.getLevel();

				break;
				
			case 4:
				
				System.out.println("You drink the potion, and suddenly feel mind become slower and have a harder time at deducing things. Intelligence -1");
				Player.intelligence--;
				Player.getLevel();

				break;
				
			case 5:
				
				System.out.println("You drink the potion, and suddenly feel utter despair. This is a legendary poison that degrades all aspects. All stats -1");
				Player.intelligence--;
				Player.strength--;
				Player.dexterity--;
				Player.health--;
				Player.getLevel();
				
				
				break;
			
			}
			
			
		break;
		
	
		}
		
	}
	
	public void peopleEvent() {
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 1 + 1);
		
		switch (eventNbr) {
		
		case 1:
			//Good
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			
			switch (eventNbr) {
			
			case 1:
				//Good
				
				eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);
				
				switch (eventNbr) {
				
				case 1:
					
					System.out.println("You come across an armor smith. He is a stout and hardy man who gifts you with armor better than you had before. Health +1");
					Player.health++;
					Player.getLevel();

					break;
					
				case 2:
					
					System.out.println("You come across a warrior. He teaches you battle etiquette as well as better ways to wield weapons. Strength +1");
					Player.strength++;
					Player.getLevel();

					break;
					
				case 3:
					
					System.out.println("You come across an archer. She teaches you how to better yourself in wielding a bow. Your accuracy improves. Dexterity +1");
					Player.dexterity++;
					Player.getLevel();

					break;
					
				case 4:
					
					System.out.println("You come across a scholar, holding a great deal of books. You sit down with him and become more educated in the ways of Computer Science, Mathematics, and the Introduction to Engineering. Intelligence +1");
					Player.intelligence++;
					Player.getLevel();

					break;
					
				case 5:
					
					System.out.println("You come across a mysterious person in a cloak. You approach the person, and realize that it is a legendary sage. With a mere glance of eye contact, you are profoundly enlightened in an indescribable way. In a blink, the sage is gone. All stats +1");
					Player.intelligence++;
					Player.strength++;
					Player.dexterity++;
					Player.health++;
					Player.getLevel();

					
					break;
				
				}
			
			
			

			break;
			
			case 2:
				//Bad
				System.out.println(eventNbr);
				//There is no bad, too harsh

			break;
		
			}
		}
		
	}
	
	public void skillCheckEvent() {
		
			eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			
			switch (eventNbr) {
				
			case 1:
				
				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("While exploring, you accidentally overturn a structure, sending many heavy objects falling down upon you. Skill Check of Strength (3)\n");
					
					if(Player.strength >= 3) {
						System.out.println("You capably grab the avalanche and hoist it off yourself. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("The weight is too much and topples you over. You look helpless underneath all of it. A traveler happens to walk by and helps you out, but not before berating you Health(-1)\n");
						Player.health--;						
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("An aggressive beast emerges and jumps on top of you. You wrestle with it as it snarls and snaps it's jaws inches from your face. Skill Check of Strength (5)\n");
					
					if(Player.strength >= 5) {
						System.out.println("You grab the monster and toss it off yourself. It yelps and retreats. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)\n");
						Player.health--;						
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("A powerful mage approaches you and challenges you. Before you can reach for your weapon, she casts a triple gravity spell. That's not -9.8, that's -29.4!  Skill Check of Strength (7) \n");
					
					if(Player.strength >= 7) {
						System.out.println("The mage looks stunned as you stand there, your calves operating with the power of Thor in the, as you menacingly walk towards her. She retreats in terror as you sit there bench pressing and drinking Whey protein shakes. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)\n");
						Player.health--;						
					}
				}
				

				break;
				
			case 2:

				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("While exploring, you accidentally overturn a structure, sending many heavy objects falling down upon you. Skill Check of Strength (3)");
					
					if(Player.strength >= 3) {
						System.out.println("You capably grab the avalanche and hoist it off yourself. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The weight is too much and topples you over. You look helpless underneath all of it. A traveler happens to walk by and helps you out, but not before berating you Health(-1)");
						Player.health--;						
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("An aggressive beast emerges and jumps on top of you. You wrestle with it as it snarls and snaps it's jaws inches from your face. Skill Check of Strength (5)");
					
					if(Player.strength >= 5) {
						System.out.println("You grab the monster and toss it off yourself. It yelps and retreats. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("A powerful mage approaches you and challenges you. Before you can reach for your weapon, she casts a triple gravity spell. That's not -9.8, that's -29.4!  Skill Check of Strength (7)");
					
					if(Player.strength >= 7) {
						System.out.println("The mage looks stunned as you stand there, your calves operating with the power of Thor in the, as you menacingly walk towards her. She retreats in terror as you sit there bench pressing and drinking Whey protein shakes. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}
				
				break;
				
			case 3:
				
				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("While exploring, you accidentally overturn a structure, sending many heavy objects falling down upon you. Skill Check of Strength (3)");
					
					if(Player.strength >= 3) {
						System.out.println("You capably grab the avalanche and hoist it off yourself. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The weight is too much and topples you over. You look helpless underneath all of it. A traveler happens to walk by and helps you out, but not before berating you Health(-1)");
						Player.health--;						
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("An aggressive beast emerges and jumps on top of you. You wrestle with it as it snarls and snaps it's jaws inches from your face. Skill Check of Strength (5)");
					
					if(Player.strength >= 5) {
						System.out.println("You grab the monster and toss it off yourself. It yelps and retreats. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("A powerful mage approaches you and challenges you. Before you can reach for your weapon, she casts a triple gravity spell. That's not -9.8, that's -29.4!  Skill Check of Strength (7)");
					
					if(Player.strength >= 7) {
						System.out.println("The mage looks stunned as you stand there, your calves operating with the power of Thor in the, as you menacingly walk towards her. She retreats in terror as you sit there bench pressing and drinking Whey protein shakes. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}

				break;
				
			case 4:
				
				//all skills
				
				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("While exploring, you accidentally overturn a structure, sending many heavy objects falling down upon you. Skill Check of Strength (3)");
					
					if(Player.strength >= 3) {
						System.out.println("You capably grab the avalanche and hoist it off yourself. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The weight is too much and topples you over. You look helpless underneath all of it. A traveler happens to walk by and helps you out, but not before berating you Health(-1)");
						Player.health--;						
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("An aggressive beast emerges and jumps on top of you. You wrestle with it as it snarls and snaps it's jaws inches from your face. Skill Check of Strength (5)");
					
					if(Player.strength >= 5) {
						System.out.println("You grab the monster and toss it off yourself. It yelps and retreats. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("A powerful mage approaches you and challenges you. Before you can reach for your weapon, she casts a triple gravity spell. That's not -9.8, that's -29.4!  Skill Check of Strength (7)");
					
					if(Player.strength >= 7) {
						System.out.println("The mage looks stunned as you stand there, your calves operating with the power of Thor in the, as you menacingly walk towards her. She retreats in terror as you sit there bench pressing and drinking Whey protein shakes. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("The beast is too powerful and while you manage to hold it off, it still causes some scratches. Health(-1)");
						Player.health--;						
					}
				}
				
				break;		
				
		}
			
		
	}
	
	public void testing() {
		skillCheckEvent();
		
	}
	
	public void fight () {
					
	}
		
	
	
	/* Types of events
	 * 
	 * People, either trainers or enemies less common
	 * 
	 * Potions (good or bad) rare
	 * 
	 * Skill checks (good and bad) common
	 * 
	 * 
	 * 
	 * */
	
	
}
