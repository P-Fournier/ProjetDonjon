import java.util.Scanner;


public abstract class Item {
	static Scanner sc = new Scanner (System.in);
	
	public abstract boolean use (Player user) throws Exception ;
	/**
	 * choix d'une action sur le loot
	 * @param user joueur choisissant une action
	 * @return retourne vrai si une action est effectué
	 */
	public boolean chooseAction (Player user){
		System.out.println ("You choose "+this+" , select an action : ");
		System.out.println ("You can \"use\" it ");
		System.out.println ("Or \"throw down\" it ");
		System.out.println ("Or just \"cancel\" ");
		do {
			String choose = sc.nextLine();
			switch (choose){
				case "use":
					try {
						return this.use(user);
					}catch (Exception e){
						System.out.println(e);
					}
					break;
				case "throw down":
					try {
						this.throwDown(user);
						return true;
					}catch (Exception e){
						e.printStackTrace();;
					}
					break;
				case "cancel":
					return false;
				default :
					System.out.println("This action doesn't exist");
			}
		}while (true);
	}
	/**
	 * jette l'objet sur le sol de la salle courante du joueur appelant
	 * @param user joueur utilisant l'objet
	 * @throws Exception si l'objet ne se trouve pas dans l'inventaire
	 */
	public void throwDown (Player user) throws Exception{
		System.out.println("throw down");
		user.removeFromInventory(this);
		user.getCurrentRoom().addToOnTheFloor(this);
		System.out.println("You throw down "+this+" on the floor");
	}
}
