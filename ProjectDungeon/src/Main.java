import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner (System.in);
	/**
	 * donne la liste des commandes du jeu
	 */
	public static void showOptions (){
		System.out.println("help : show all commands");
		System.out.println("description : get a description for the the current room");
		System.out.println("show stats : show all stats of the current player (life points , damage)");
		System.out.println("open inventory : show the inventory of the current player ");
		System.out.println("go to 'door' : make the player use the door past in parameter");
		System.out.println("attack : hit the monster in the current room");
		System.out.println("open chest : show the contents of the chest in the current room");
		System.out.println("push button : use the button in the current room \n");
	}
	public static void main (String [] args ){
		/*Player p = new Player ();
		p.showInventory();*/
		Game g = null;
		System.out.println("Welcome to Dungeons Quest  ! \n");
		System.out.println("1) New game");
		System.out.println("2) Load game\n");
		do {
			switch (sc.nextInt()){
				case 1 :
					System.out.println ("In this game , you will explorate dungeons alone or with"
							+ " your friends . You will encounter monsters , find chests and maybe"
							+ " triumph of the Dungeons Quest ! \n");
					System.out.println("This all the command you had to know to achieve your quest : \n");
					showOptions();
					System.out.println("Just a last advice : make a map of the dungeon . \n ");
					System.out.println("Now let's ready to begin your quest ! \n");
					try{
						g = new Game (); 
					}catch (Exception e){
						e.printStackTrace();
					}
					break;
				case 2 :
					/*On propose un choix parmi les partie sauvegardé et la possibilité d'annuler
					on récupère le nom du fichier dans la string saveFile remplit avec une bétise pour
					le squelette mais qui sera remplit avec le choix */
					String saveFile = "NIMPORTEKOI.sav";
					if (saveFile!=null){ // null si on a annuler
						g = new Game (saveFile);
					}
					break;
				default :
					System.out.println("this command doesn't exist !");
			}
		}while (g==null);
	}
		
}
