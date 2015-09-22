import java.util.*;
public class Player {
	static Scanner sc = new Scanner (System.in);
	protected int life ;
	protected int maxLife ;
	protected LinkedHashMap <Loot,Integer> inventory ; // taille maximum de l'inventaire
	protected Weapon equiped ;
	protected Room currentRoom;
	/*
	 * protected int level ;
     * protected int experience ;
	 * protected int lowerDamage ;
	 * protected int higherDamage ;
	*/
	public Player (){
		inventory = new LinkedHashMap<Loot,Integer>();
		inventory.put(new Key(), 2);
		inventory.put(new Potion (10), 2);
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
	
	public HashMap<Loot, Integer> getInventory() {
		return inventory;
	}
	
	public void setInventory(LinkedHashMap<Loot, Integer> inventory) {
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
	
	public void showInventory (){
		int i = 1;
		System.out.println ("Choose an item to make an action or cancel : ");
		for (Loot l : inventory.keySet()){
			System.out.println (i+" ) "+inventory.get(l)+" x "+l);
			i++;
		}
		System.out.println(i+" ) Cancel");
		int selection;
		do{
			selection = sc.nextInt();
		}while ((selection > i)&&(selection < 0));
		if (selection != i){
			i = 1 ;
			for (Loot l : inventory.keySet()){
				if (i==selection){
					l.chooseAction(this);
					break;
				}
				i++;
			}
		}
	}
	public void removeFromInventory (Loot l) throws Exception{
		if (!inventory.containsKey(l)){
			throw new Exception ("inventory doesn't contents the loot");
		}else{
			inventory.put(l,inventory.get(l)-1);
			if (inventory.get(l)==0){
				inventory.remove(l);
			}
		}	
	}
}
