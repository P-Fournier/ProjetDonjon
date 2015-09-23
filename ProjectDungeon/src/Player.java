import java.util.*;
public class Player {
	static Scanner sc = new Scanner (System.in);
	protected int life ;
	protected int maxLife ;
	protected HashMap <Item,Integer> inventory ; // taille maximum de l'inventaire
	protected Weapon equiped ;
	protected Room currentRoom;
	protected String name ; 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * protected int level ;
     * protected int experience ;*/
	protected int lowerDamage ;
	protected int higherDamage ;
	
	public Player (String name , String classe , Dungeon start) throws Exception{
		this.name = name;
		this.currentRoom=start.getEntrance();
		inventory = new HashMap <Item,Integer>();
		switch (classe){
			case "warrior":
				lowerDamage = 6;
				higherDamage = 10;
				life = 50;
				maxLife = 50;
				equiped = new Weapon ("iron sword",10);
				inventory.put(new Potion (10), 3);
				break;
			case "idiot":
				lowerDamage = 2;
				higherDamage = 6;
				life = 30;
				maxLife = 30;
				equiped = new Weapon ("fork",2);
				inventory.put(new Potion (10), 1);
				break;
			case "alchemist":
				lowerDamage = 4;
				higherDamage = 8;
				life = 50;
				maxLife = 50;
				equiped = new Weapon ("wood sword",5);
				inventory.put(new Potion (10), 3);
				inventory.put(new Potion (20), 2);
				break;
			case "giant":
				lowerDamage = 4;
				higherDamage = 8;
				life = 70;
				maxLife = 70;
				equiped = new Weapon ("wood sword",5);
				inventory.put(new Potion (10), 3);
				break;
			default :
				throw new Exception ("This class doesn't exist");
		}
	}
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	
	public HashMap<Item, Integer> getInventory() {
		return inventory;
	}
	
	public void setInventory(HashMap<Item, Integer> inventory) {
		this.inventory = inventory;
	}
	
	public Weapon getEquiped() {
		return equiped;
	}
	
	public void setEquiped(Weapon equiped) {
		this.equiped = equiped;
	}
	public Room getCurrentRoom() {
		return currentRoom;
	}


	public void setCurrentRoom(Room currency) {
		this.currentRoom = currency;
	}
	/**
	 * 
	 * @return retourne vrai si on a effectuer une action dans l'inventaire
	 */
	public boolean showInventory (){
		int i = 1;
		System.out.println ("Choose an item to make an action or cancel : ");
		for (Item l : inventory.keySet()){
			System.out.println (i+" ) "+inventory.get(l)+" x "+l);
			i++;
		}
		System.out.println(i+" ) Cancel");
		int selection;
		do{
			selection = sc.nextInt();
		}while ((selection > i)&&(selection < 0));
		boolean action = false ;
		if (selection != i){
			i = 1 ;
			for (Item l : inventory.keySet()){
				if (i==selection){
					action = l.chooseAction(this);
				}
				i++;
			}
		}
		return action ;
	}
	/**
	 * retire 1 unité du loot l dans l'inventaire du joueur appelant
	 * @param l le loot a retirer 
	 * @throws Exception si on a pas le loot dans l'inventaire
	 */
	public void removeFromInventory (Item l) throws Exception{
		if (!inventory.containsKey(l)){
			throw new Exception ("inventory doesn't contents the loot");
		}else{
			inventory.put(l,inventory.get(l)-1);
			if (inventory.get(l)==0){
				inventory.remove(l);
			}
		}	
	}
	/**
	 * ajoute une unité de loot dans l'inventaire
	 * @param l le loot a ajouter
	 */
	public void addToInventory (Item l){
		if (this.inventory.containsKey(l)){
			inventory.put(l, inventory.get(l)+1);
		}else{
			inventory.put(l, 1);
		}
	}
}
