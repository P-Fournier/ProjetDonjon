import java.util.*;
public class Room {
	protected HashMap<String,Door> doors ;
	protected HashMap<Door,Room> neighbor ;
	protected Door button ;
	protected Monster monster ;
	protected Item chest ;
	protected HashMap<Item,Integer> onTheFloor ;
	
	public Room (HashMap<String,Door>exit , HashMap<Door,Room> neighbor, Door button , Monster monster , Item chest ){
		
		this.doors = exit ;
		this.neighbor = neighbor ;
		this.button = button ;
		this.monster = monster ;
		this.chest = chest ;
		this.onTheFloor = new HashMap <Item,Integer> ();
		
	}

	public HashMap<Item, Integer> getOnTheFloor() {
		return onTheFloor;
	}

	public void setOnTheFloor(HashMap<Item, Integer> onTheFloor) {
		this.onTheFloor = onTheFloor;
	}

	public HashMap<String, Door> getExit() {
		return doors;
	}

	public void setExit(HashMap<String, Door> exit) {
		this.doors = exit;
	}

	public HashMap<Door, Room> getNeighbor() {
		return neighbor;
	}

	public void setNeighbor(HashMap<Door, Room> neighbor) {
		this.neighbor = neighbor;
	}

	public Door getButton() {
		return button;
	}

	public void setButton(Door button) {
		this.button = button;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public Item getChest() {
		return chest;
	}

	public void setChest(Item chest) {
		this.chest = chest;
	}
	/**
	 * show all the loots leave on the floor to the user who can get back it .
	 * @param user the player who want pick up the loot leave on the floor 
	 */
	public void pickUpOnTheFloor (Player user){
		
	}
	public void addToOnTheFloor(Item l){
		if (this.onTheFloor.containsKey(l)){
			onTheFloor.put(l, onTheFloor.get(l)+1);
		}else{
			onTheFloor.put(l, 1);
		}
	}
	/**
	 * affiche les doors fermé a cle (la chaine de caractere associé dans doors) et visible
	 */
	public void showLockedKeyDoor(){
		
	}
	/**
	 * afficher les doors visible , coffre si il y en a et button
	 */
	public void getDescription (){
		
	}
}
