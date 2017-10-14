import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {

	int eventNbr;
	String potionColor;
	String potionTexture;
	String enemy;
	String enemyType;
	int enemyHealth;
	int enemyDamage;
	boolean runAway;
	int eventChoice;
	
	Scanner eventIn = new Scanner (System.in);
	
	/*TODO
	 * 
	 * Guide
	 * 
	 * 
	 * 
	 * Input validation oh god
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
			
			else if (eventNbr <= 7) {
				//30% 5 - 7
				//This should be enemy
				fight();
			}
			
			else {
				//30% 8-10
				//skillCheckEvent();
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
		System.out.println("Do you drink it? (1) yes, (2) no");

		if (eventIn.nextInt() == 1) {
		
		
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
		else {System.out.println("You pass");}

		
	}
	
	public void peopleEvent() {
		
	
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
				
			
		}
		
	}
	
	public void skillCheckEvent() {
		
			eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			
			switch (eventNbr) {
				
			case 1:
				//strength checks
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
						Player.getLevel();
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
						Player.getLevel();
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("A powerful mage approaches you and challenges you. Before you can reach for your weapon, she casts a triple gravity spell. That's not -9.8, that's -29.4!  Skill Check of Strength (7) \n");
					
					if(Player.strength >= 7) {
						System.out.println("The mage looks stunned as you stand there, your calves operating with the power of Thor in the, as you menacingly walk towards her. She retreats in terror as you sit there bench pressing and drinking Whey protein shakes. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("You're forced into the ground and crushed, thankfully she leaves you alone afterwards and leaves. Health(-1)\n");
						Player.health--;	
						Player.getLevel();
					}
				}
				

				break;
				
			case 2:
				//dexterity
				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("You find a small, gray, chest. Unable to resist temptation, you open it up. A string snaps and triggers a mechanism to shoot a crossbow bolt at you. Skill Check of Dexterity(3)\n");
					
					if(Player.dexterity >= 3) {
						System.out.println("You quickly react and dodge out of the way. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("You react slowly and merely block with your arm. The bolt still hurts you. Health(-1)\n");
						Player.dexterity--;	
						Player.getLevel();
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("You step on a hidden pressure plate. You hear the sound of wind rushing as a massive spiked log swings out on a string. Skill Check of Dexterity (5)\n");
					
					if(Player.dexterity >= 5) {
						System.out.println("You nimbly leap out of the way of the log. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("You react slowly and the log grazes you, painfully knocking you to the ground. Health(-1)\n");
						Player.health--;
						Player.getLevel();
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("As you investigate a small room, you step over a near invisible tripwire. A cascade of a hundred knives rains down upon you. Skill Check of Dexterity (7)\n");
					
					if(Player.dexterity >= 7) {
						System.out.println("You perform an elegant dance. dodging every knife and kicking each one to perfectly deflect each knife to hit another one. At the end of the chaos, you stand perfectly unscathed in a ring of broken and deflected knives, all perfectly arranged to make a smily face around you. LevelUp!\n");
						Player.levelUp();
					}
					else {
						System.out.println("You can't dodge all of these, the area is too great and the projectiles are too numerous. You huddle down guard yourself, although you receive multiple inflictions to the back. Health(-1)\n");
						Player.health--;
						Player.getLevel();
					}
				}
				
				break;
				
			case 3:
				//intelligence
				eventNbr = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				
				if(eventNbr == 1) {
					System.out.println("You uncover a message etched onto a wall. It is written in a strange and archaic language. You recall from your academia that this is a lost civilization's writing, and you use what you remember to make out the message. Skill Check of Intelligence (3)\n");
					
					if(Player.intelligence >= 3) {
						System.out.println("You confidently determine that this says \"Insects lie here. Kind that feast on flesh. Be wary.\". A little bit shaken, you look around and actually do notice a small army of the bugs encroaching upon you. You throw a torch down and scatter them about . LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("You stare at the rune long and hard. After a good amount of analyzing, you realize that you haven't the slightest clue what this is talking about. Suddenly, a bug stings you. You're terrified to find your legs covered in strange insects, and quickly pat them off. Health(-1)");
						Player.health--;
						Player.getLevel();
					}																				
				}
				
				if (eventNbr == 2) {
					System.out.println("A foul aroma rises to your nose. Quite pungent! You plug your nose. You get a sense that somethings wrong. Skill Check of Intelligence (5)\n");
					
					if(Player.intelligence >= 5) {
						System.out.println("You realize that this smell matches with what you learned in a class where you studies poisons at one time. This is a noxious gas! You quickly exit and flee, and cough up what entered your lungs in a fierce wheezing fit! You're okay. LevelUp! \n");
						Player.levelUp();
					}
					else {
						System.out.println("While it smells nasty, you shrug it off and decide to carry on. Suddenly you feel repulsed and sick, and you have a vomiting fit as you fall horribly ill. You recover shortly after. Health(-1)\n");
						Player.health--;
						Player.getLevel();
					}
				}
				
				if (eventNbr == 3) {
					System.out.println("You suddenly feel incredibly sleeply and fall to your knees, dazed. You black out, and have strange, abstract dreams. It feels as if something is probing your mind, feasting on your memories and draining your mental energy. Skill Check of Intelligence (7)");
					
					if(Player.intelligence >= 7) {
						System.out.println("You fight the feeling, challenge it in your dream. Although the oprpressive mental wall resists, you defiantly push it. You feel the tides turn in your favor, and ultimately gain control over the feeling, casting it out of your mind. You wake up and see a shadow being, dumbstruck that you resisted his illusionary world spell in which it would feast on your dreams. It quickly dematerializes before you can attack it, and flees. You sit down and solve a rubiks cube behind your back, one handed, and with the other read a book on Quantum physics in the other. LevelUp!");
						Player.levelUp();
					}
					else {
						System.out.println("You wake up feeling dazed, and boggled. What happened? You get up, and your head pounds. Health(-1)");
						Player.health--;	
						Player.getLevel();
					}
				}

				break;
					
				
		}
			
		
	}
	
	public void testing() {
		potionEvent();
		
	}
	
	public void enemyGenerator () {
					
		eventNbr = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		
		switch(eventNbr) {
		case 1: //strength
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			enemyType = "Physical";
			if(eventNbr == 1) {enemy = "Goblin"; enemyHealth = 1; enemyDamage= 1;}
			if(eventNbr == 2) {enemy = "Hobgoblin"; enemyHealth = 2;  enemyDamage= 2;}
			if(eventNbr == 3) {enemy = "Orc"; enemyHealth = 3;  enemyDamage= 3;}
			if(eventNbr == 4) {enemy = "Brutal Enforcer"; enemyHealth = 4;  enemyDamage= 4;}
			
			break;
			
		case 2: //dexterity
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			enemyType = "Ranged";
			
			if(eventNbr == 1) {enemy = "Bat"; enemyHealth = 1; enemyDamage= 1;}
			if(eventNbr == 2) {enemy = "Winged Imp "; enemyHealth = 2; enemyDamage= 2;}
			if(eventNbr == 3) {enemy = "Headhunter Falcon"; enemyHealth = 3; enemyDamage= 3;}
			if(eventNbr == 4) {enemy = "Winged Maneater"; enemyHealth = 4; enemyDamage= 4;}
			
			break;
			
		case 3: //intelligence
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			enemyType = "Magical";
			
			if(eventNbr == 1) {enemy = "Ghost"; enemyHealth = 1; enemyDamage= 1;}
			if(eventNbr == 2) {enemy = "Black Magic Practicioner"; enemyHealth = 2; enemyDamage= 2;}
			if(eventNbr == 3) {enemy = "Poltergeist"; enemyHealth = 3; enemyDamage= 3;}
			if(eventNbr == 4) {enemy = "Dark Sorcerer"; enemyHealth = 4; enemyDamage= 4;}
			
			break;
			
		case 4: //all around
			
			eventNbr = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			enemyType = "All";
			
			if(eventNbr == 1) {enemy = "Accomplished Fighter"; enemyHealth = 2; enemyDamage= 3;}
			if(eventNbr == 2) {enemy = "Elvish Hunter"; enemyHealth = 3; enemyDamage= 6;}
			if(eventNbr == 3) {enemy = "Champion Challenger"; enemyHealth = 5; enemyDamage= 8;}
			if(eventNbr == 4) {enemy = "Worldeater Dragon"; enemyHealth = 5; enemyDamage= 15;}
			
			
			break;
		}
		
	}
	
	public void fight () {
		
		runAway = false;
		enemyGenerator();
		
		System.out.println("You encounter a " + enemy);
		System.out.println("It's type is  " + enemyType);
		
		System.out.println("Your stats");
		Player.getLevel();
		
		
		
		do {
			System.out.println("Your Battle Health: " + Player.battleHealth);
			if (enemyType == "Physical") {System.out.println("Your damage is your strength: " + Player.strength );}
			if (enemyType == "Ranged") {System.out.println("Your damage is your dexterity: " + Player.dexterity );}
			if (enemyType == "Magical") {System.out.println("Your damage is your intelligence: " + Player.intelligence );}
			if (enemyType == "All") {System.out.println("Your damage is all your damage stats combined: " + Player.allDamage);}

			System.out.println("");
			
			System.out.println("The " + enemy + "'s Battle Health: " + enemyHealth);
			System.out.println("The " + enemy+ "'s Damage: " + enemyDamage);

			System.out.println("(1) Fight (2) Run Away");
			eventChoice = eventIn.nextInt();
			
			if (eventChoice == 2) {
				eventNbr = ThreadLocalRandom.current().nextInt(1, 2 + 1);

				if(eventNbr == 1) {
					System.out.println("You failed to get away");
					eventChoice = 1;
				}
				
				if(eventNbr == 2) {
					System.out.println("You got away!"); 
					runAway = true;
				}
								
			}
			
			if(eventChoice == 1) {
				System.out.println("You fight");
				
				Player.battleHealth -= enemyDamage;
				if (enemyType == "Physical") {enemyHealth -= Player.strength ;}
				if (enemyType == "Ranged") {enemyHealth -= Player.dexterity; }
				if (enemyType == "Magical") {enemyHealth -= Player.intelligence; }
				if (enemyType == "All") {enemyHealth -= Player.allDamage;}
				
				if(Player.battleHealth <= 0) {			
					System.out.println("Game Over");
					Main.gameStatus = false;
				}
				
				if(enemyHealth <= 0) {
					if (Main.gameStatus = true) {
					System.out.println("You defeated the " + enemy + "! LevelUp! ");
					Player.levelUp();
				}
				}
				
			}
			
			
		}
		
		while (enemyHealth > 0 && Player.battleHealth > 0 && !runAway);
		
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
