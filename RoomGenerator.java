import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RoomGenerator {

	public void RoomGenerate () {
		/*
		 * Any order, but must go through most of levels first
		 * Forest THEN Cave THEN Castle
		 * 
		 * */
		
		Scanner in = new Scanner (System.in);
		String setting = "";
		
		int level = 1;
		
		/*
		int nbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		System.out.println(nbr);
		*/
		
		switch (level) {
		case 1 : 
			//Forest
			setting = "Forest";
			
			int nbr = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			switch(nbr) 	{
				case 1: {
					System.out.println(setting + nbr);
					System.out.println("Straight ahead there is a dirt path that leads to a clearing");
					System.out.println("To your right, a dirt path winds down deeper into the woods");
					
					Main.choice = in.nextInt();
					
					System.out.println("You are on a grassy patch of land in a circular clearing in a the forest.");
					


				}
				break;
				
				case 2: {
					System.out.println(setting + nbr);

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
	
	public static void main (String[] args) {
		/*
		 * Any order, but must go through most of levels first
		 * Forest THEN Cave THEN Castle
		 * 
		 * */
		
		Scanner in = new Scanner (System.in);
		String setting = "";
		
		int level = 1;
		
		/*
		int nbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		System.out.println(nbr);
		*/
		
		switch (level) {
		case 1 : 
			//Forest
			setting = "Forest";
			
			int nbr = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			switch(nbr) 	{
				case 1: {
					System.out.println(setting + nbr);
					System.out.println("Straight ahead there is a dirt path that leads to a clearing");
					System.out.println("To your right, a dirt path winds down deeper into the woods");
					
					Main.choice = in.nextInt();
					
					System.out.println("You are on a grassy patch of land in a circular clearing in a the forest.");
					


				}
				break;
				
				case 2: {
					System.out.println(setting + nbr);

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
	
}
