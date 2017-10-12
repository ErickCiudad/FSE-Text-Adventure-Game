import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {

	int eventNbr;
	String potionColor;
	String potionTexture;
	
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
				System.out.println(eventNbr + "people");
			}
			
			else if (eventNbr <= 6) {
				//20% 5 - 6
				//nothing happens
				System.out.println("The situation was rather uneventful, there is nothing to report");
			}
			
			else {
				//30% 7-10
				//skillCheckEvent();
				System.out.println(eventNbr + "check");
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
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
		
		switch (eventNbr) {
		
		case 1:
			//Good
			System.out.println(eventNbr);

			break;
			
			case 2:
				//Bad
				System.out.println(eventNbr);

			break;
		
		}
		
	}
	
	public void skillCheckEvent() {
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
		
		switch (eventNbr) {
		
		case 1:
			//Good
			System.out.println(eventNbr);

			break;
			
			case 2:
				//Bad
				System.out.println(eventNbr);

			break;
		
		}
		
	}
	
	public void testing() {
		potionEvent();
		
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
