import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RoomGenerator {

	boolean forest1 = true;
	boolean forest2 = true;
	boolean forest3 = true;
	boolean forest4 = true;
	boolean forest5 = true;
	boolean forest6 = true;
	boolean forest7 = true;
	boolean forest8 = true;
	boolean forest9 = true;
	boolean forest10 = true;
	int forestCounter = 0;

	public void RoomGenerate () {
		
		Scanner in = new Scanner (System.in);
		String setting = "";
		
		int area = 1;
		int roomChoice;
		
		/*
		int nbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		System.out.println(nbr);
		*/
		
		switch (area) {
		case 1 : 
			//Forest
			setting = "Forest";
			
			int nbr = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			switch(nbr) 	{
				case 1: {
					
					if(forest1 == false) {System.out.println("Already done"); RoomGenerate();}
					forest1 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					
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
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
				
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 3: {
					if(forest3 == false) {System.out.println("Already done"); RoomGenerate();}
					forest3 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 4: {
					if(forest4 == false) {System.out.println("Already done"); RoomGenerate();}
					forest4 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 5: {
					if(forest5 == false) {System.out.println("Already done"); RoomGenerate();}
					forest5 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 6: {
					if(forest6 == false) {System.out.println("Already done"); RoomGenerate();}
					forest6 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 7: {
					if(forest7 == false) {System.out.println("Already done"); RoomGenerate();}
					forest7 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 8: {
					if(forest8 == false) {System.out.println("Already done"); RoomGenerate();}
					forest8 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 9: {
					if(forest9 == false) {System.out.println("Already done"); RoomGenerate();}
					forest9 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

				case 10: {
					if(forest10 == false) {System.out.println("Already done"); RoomGenerate();}
					forest10 = false;
					forestCounter++;
					if(forestCounter == 5) {
						area = 2;
					}
					System.out.println(setting + nbr);
					RoomGenerate();

				}
				break;

			}
			
			
			break;
			
		case 2 : 
			// Cave
			System.out.println("Two CAVE");
			break;
			
		case 3 : 
			// Castle
			System.out.println("Three");
			break;
			
		
			
		}

	}
	
	///Main happens here
	
	}
	

