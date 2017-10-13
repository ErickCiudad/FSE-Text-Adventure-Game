import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RoomGenerator {

	int roomNbr;
	Scanner roomIn = new Scanner(System.in);
	
	public void RoomGenerate () {
		
		System.out.println(roomFlavor());
		System.out.println("On your left, " + Scene());
		System.out.println("On your right, " + Scene());		
	
		System.out.println("Where would like to go? (1) left, (2) right");
		roomIn.nextInt();
		
		
	}
	
	public String Scene() {

		roomNbr = ThreadLocalRandom.current().nextInt(1, 50 + 1);
		
		switch (roomNbr) {
			case 1: return "some trees and a grassy hill is visible.";
			case 2: return "a large field opens up";
			case 3: return "you see some stone structures and a ruin of a tower";
			case 4: return "there is a dense gorge of trees";
			case 5: return "a dark cave opens up";
			case 6: return "a thin and shallow river runs murkily and full of sediment";
			case 7: return "a strong and loud stream courses, deep and blue";
			case 8: return "a gigantic tree stands proud and tall";
			case 9: return "a gigantic tree lays toppled, and hollow";
			case 10: return "the trail lowers and leads into ominous and misty woods";
			case 11: return "the trail steepens into murky water you have to wade through";
			case 12: return "a bend leads to a thin trail overlooking a steep cliff, the bottom of the valley far out of sight, only the tops of trees visible";
			case 13: return "thick grass raises up chest high";
			case 14: return "the path inclines and begins leading you up hill";
			case 15: return "old stones lay in numerous shapes, but still distinctly human carved. They form a very loose path";
			case 16: return "several bones lay strewn about";
			case 17: return "evidence of a campfire is apparent, although it looks long abandoned. The ash is scattered about, yet a pot was still left behind";
			case 18: return "a stone brick wall has been erected";
			case 19: return "a small shrine stands, with a small red banner draped from the top. There is a small offering place at the bottom.";
			case 20: return "the path clears out to dirt, and a sword is stabbed into the ground";
			case 21: return "the trail winds around and encompasses a great lake";
			case 22: return "the path lowers and begins to get sandy";
			case 23: return "faint voices can be heard far, far off, carried by the wind. It is impossible to tell what they say.";
			case 24: return "a far off, yet piercingly distinct, horn sounds in the air";
			case 25: return "a small hole opens up in the rock, and although it is a tight fit, it is somewhat apparent it has been used before";
			case 26: return "a tiny wooden trapdoor with an iron handle lay in the ground. It has a ladderway to go deeper.";
			case 27: return "a sheer rock wall, about twenty feet high, is able to be scaled";
			case 28: return "a small, radiant and orange glow of fire is apparent in the far distance";
			case 29: return "the path converges around a bend and leads out of sight";
			case 30: return "you smell what you can't be certain is, yet definitely smells like, cooking";
			case 31: return "fog lingers, obscuring view";
			case 32: return "a large building stands, it's wooden doors busted open and ajar";
			case 33: return "a human built courtyard opens up, a fountain positioned in the center, yet devoid of water";
			case 34: return "a hedge opens up, and it is noticably twisty and maze-like in nature";
			case 35: return "a large and grassy field opens, with neat flowers of varying colors arranged along the perimeter";
			case 36: return "a lantern is lit on a post";
			case 37: return "a tight hallway runs straight and out of view";
			case 38: return "a small animal runs towards you, perhaps in a panic from something in that direction";
			case 39: return "a small and ominous howling noise, perhaps wind, perhaps something else, echoes off in the distance";
			case 40: return "the floor continues then directly cuts off into an overview of a large chasm";
			case 41: return "a river runs into a large and wooden wheel, turning slowly. It is unclear what purpose it serves.";
			case 42: return "a thin and decrepit ladder leans against an erected wall.";
			case 43: return "a small spiral iron stair case runs downward";
			case 44: return "a room opens up with bookcases on eachside, and scrolls strewn about";
			case 45: return "a large room opens up with a big whole in the center, a giant fire burning in the center. It is unclear what objects are the fuel of the fire, but apparent several things were tossed in. ";
			case 46: return "a room with a cracked and crumbled ceiling is in view. The crumbled material of the building forms a loose and jagged staircase to the second floor.";
			case 47: return "a large cage hangs by chain from a post stabbed into the wall, the cage overhangs a steep dropoff";
			case 48: return "a bridge spans over a valley";
			case 49: return "a colossal statue stands in a valley, it's hands upraised, forming a bridge to the other side. A waterfall runs over and through the shoulders of the giant.";
			case 50: return "a thin and coarse circular hallway opens up. Crystals seem to appear and glisten out of the sides of the wall";
		}
		
		return "";
		
	}
	
	public void roomTest() {
		RoomGenerate();
	}
	
	public String roomFlavor() {
		
		roomNbr = ThreadLocalRandom.current().nextInt(1, 50 + 1);
		
		switch (roomNbr) {
		case 1: return "It begins to rain.";
		case 2: return "It is night";
		case 3: return "It is day";
		case 4: return "It gets foggy";
		case 5: return "It gets bitterly cold";
		case 6: return "It warms up";
		case 7: return "It gets very hot";
		case 8: return "It starts getting chilly";
		case 9: return "It gets humid";
		case 10: return "The weather is clear";
		}
		if(roomNbr >= 11) {
			
		}
		
		return "";
	}
	
	}
	

