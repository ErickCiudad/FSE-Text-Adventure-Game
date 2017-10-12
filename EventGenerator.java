import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {

	int eventNbr;
	
	public EventGenerator() {
		
	
		}
	
	public void eventGenerate() {
	
		int eventNbr = ThreadLocalRandom.current().nextInt(1, 10 + 1);
	
			if (eventNbr == 1) {
				//10%
				//potionEvent();
				System.out.println(eventNbr + "potion");
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
		
		eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
		
		switch (eventNbr) {
		
		case 1:
			//Good
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			
			switch (eventNbr) {
			
			case 1:
				
				System.out.println("You drink the potion, and suddenly feel vigor flowing in you. Health +1");
				Player.health++;
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
			
			}
			
		break;
		
		case 2:
			//Bad
			System.out.println(eventNbr);

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
		System.out.println("You drink the potion, and suddenly feel vigor flowing in you. Health +1");
		Player.health++;
		
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
