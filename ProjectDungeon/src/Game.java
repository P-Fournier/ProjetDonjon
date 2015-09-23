import java.util.*;

public class Game {
	static Scanner sc = new Scanner (System.in);
	protected Dungeon[] allLevels ;
	protected int currentLevel ;
	protected List<Player> players ;
	protected int numberOfPlayers ;
	public Dungeon[] getAllLevels() {
		return allLevels;
	}
	public void setAllLevels(Dungeon[] allLevels) {
		this.allLevels = allLevels;
	}
	public int getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	/**
	 * initialise une nouvelle partie
	 */
	public Game () throws Exception {
		currentLevel = 0;
		// construction des donjons
		Dungeon start = new Dungeon ("enAttendant.dj");
		System.out.println("How many adventurer are you ? \n");
		do {
			numberOfPlayers = sc.nextInt();
			if (numberOfPlayers<=0){
				System.out.println("Invalid number of players \n");
			}
		}while(numberOfPlayers<=0);
		for (int i=1 ; i<=numberOfPlayers ;i++){
			String select ;
			String name;
			do{
				System.out.println ("Player "+i+" : choose the name of your adventurer \n");
				name = sc.next();
				System.out.println("Are sure of this name : "+name+" ? (yes/no) \n");
				do {
					select = sc.next();
					if (!select.equals("no")&&!select.equals("yes")){
						System.out.println("Invalid command ! \n");
					}
				}while (!select.equals("no")&&!select.equals("yes"));
			}while(select.equals("no"));
			System.out.println("Now you will choose your class , in this game you"
					+ " had 4 kind of adventurer : \n");
			System.out.println("The warrior who have an advantage to make more damage and begin"
					+ "with a better weapon ,\n");
			System.out.println("The alchemist who start with lots of healing potions ,\n");
			System.out.println("The giant who have more life points \n");
			System.out.println("And the idiot for the player who love the challenge , he got a"
					+ " disadvantage for everything \n");
			boolean choice;
			do {
				System.out.println ("Player "+i+" : choose the class of your adventurer \n");
				String pclass = sc.next();
				switch (pclass){
					case "idiot":
					case "giant":
					case "alchemist":
					case "warrior":
						choice = true;
						break;
					default :
						System.out.println("Invalid command");
						choice = false;
				}
				System.out.println("Are sure of this class : "+pclass+" ? (yes/no) \n");
				do {
					select = sc.next();
					if (!select.equals("no")&&!select.equals("yes")){
						System.out.println("Invalid command ! \n");
					}
				}while (!select.equals("no")&&!select.equals("yes"));
				if (select.equals("no")){
					choice = false ;
				}else{
					players.add(new Player (name,pclass,start));
				}
			}while (!choice);
			
		}
	}
	/**
	 * charge une partie sauvegardé 
	 * @param saveFile le fichier où la partie a été sauvegardé
	 */
	public Game (String saveFile){
		// parsing en Serialize
	}
}
