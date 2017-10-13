import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RoomGenerator {

	int roomNbr;
	
	public void RoomGenerate () {
		
		System.out.println("On your left, " + Scene());		
	}
	
	public String Scene() {

		roomNbr = ThreadLocalRandom.current().nextInt(1, 1 + 1);
		
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
			case 31: return "";
			case 32: return "";
			case 33: return "";
			case 34: return "";
			case 35: return "";
			case 36: return "";
			case 37: return "";
			case 38: return "";
			case 39: return "";
			case 40: return "";
			case 41: return "";
			case 42: return "";
			case 43: return "";
			case 44: return "";
			case 45: return "";
			case 46: return "";
			case 47: return "";
			case 48: return "";
			case 49: return "";
			case 50: return "";
		}
		
		return "error: it shouldn't get to here, only options are 1 - 50";
		
	}
	
	public void roomTest() {
		RoomGenerate();
	}
	
	}
	

