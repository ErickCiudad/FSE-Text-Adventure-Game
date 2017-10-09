import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RoomGenerator {

	boolean forest1 = true;
	boolean forest2 = true;


	public void RoomGenerate () {
		/*
		 * Any order, but must go through most of levels first
		 * Forest THEN Cave THEN Castle
		 * 
		 * */
		
		Scanner in = new Scanner (System.in);
		String setting = "";
		
		int level = 1;
		int roomChoice;
		
		/*
		int nbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		System.out.println(nbr);
		*/
		
		switch (level) {
		case 1 : 
			//Forest
			setting = "Forest";
			
			int nbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			switch(nbr) 	{
				case 1: {
					
					if(forest1 == false) {System.out.println("Already done"); RoomGenerate();}
					forest1 = false;
					
					System.out.println("(1)Straight ahead there is a dirt path that leads to a clearing");
					System.out.println("(2)To your right, a dirt path winds down deeper into the woods");
					
					//Main.choice = in.nextInt();
					do {
						roomChoice = in.nextInt();
						if(roomChoice == 1) {
							System.out.println("You are on a grassy patch of land in a circular clearing in a the forest.");
							RoomGenerate();
						}
						else if(roomChoice == 2) {
							System.out.println("You wind deeper into the forest. The light get's dimmer. The shrubbery around is dense and invading.");				
							RoomGenerate();
						}
						else {
							System.out.println("Invalid command");
						}
					}
					while(roomChoice != 1 || roomChoice != 2);
				}
				break;
				
				case 2: {
					
					if(forest2 == false) {System.out.println("Already done"); RoomGenerate();}
					forest2 = false;
				
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 3: {
					System.out.println(setting + nbr);

				}
				break;

				case 4: {
					System.out.println(setting + nbr);

				}
				break;

				case 5: {
					System.out.println(setting + nbr);

				}
				break;

				case 6: {
					System.out.println(setting + nbr);

				}
				break;

				case 7: {
					System.out.println(setting + nbr);

				}
				break;

				case 8: {
					System.out.println(setting + nbr);

				}
				break;

				case 9: {
					System.out.println(setting + nbr);

				}
				break;

				case 10: {
					System.out.println(setting + nbr);

				}
				break;

			}
			
			
			break;
			
		case 2 : 
			// Cave
			System.out.println("Two");
			break;
			
		case 3 : 
			// Castle
			System.out.println("Three");
			break;
			
		
			
		}

	}
	
	///Main happens here
	
	}
	

