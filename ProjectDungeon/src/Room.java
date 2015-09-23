import java.util.*;

public class Room {
	
	protected final String name;
	protected Map<String,Room> neighbors = new HashMap<String,Room>();
	
	protected HashMap<String,Door> exit ;
//	protected HashMap<Door,Room> neighbor ;
	protected Door button ;
	protected Monster monster ;
	protected Loot chest ;
	protected HashMap<Loot,Integer> onTheFloor ;
	
	//CONSTRUCTEUR SUIVANT LE TD /!\ réfléchir sur les modifications pour insérer les autres attributs
	public Room(String name){
		this.name = name;
	}
	
	public Room go(String direction){
		if(neighbors.containsKey(direction)){
			return neighbors.get(direction);
		}
		else{
			return null;
		}
	}
	
	public void setNeighbor(String direction, Room neighbor){
		neighbors.put(direction, neighbor);
	}
	
/*	public Room (HashMap<String,Door>exit , HashMap<Door,Room> neighbor, Door button , Monster monster , Loot chest ){
		
		this.exit = exit ;
		this.neighbor = neighbor ;
		this.button = button ;
		this.monster = monster ;
		this.chest = chest ;
		this.onTheFloor = new HashMap <Loot,Integer> ();
		
	}*/

	public HashMap<Loot, Integer> getOnTheFloor() {
		return onTheFloor;
	}

	public void setOnTheFloor(HashMap<Loot, Integer> onTheFloor) {
		this.onTheFloor = onTheFloor;
	}

	public HashMap<String, Door> getExit() {
		return exit;
	}

	public void setExit(HashMap<String, Door> exit) {
		this.exit = exit;
	}

/*	public HashMap<Door, Room> getNeighbor() {
		return neighbor;
	}

	public void setNeighbor(HashMap<Door, Room> neighbor) {
		this.neighbor = neighbor;
	}*/

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

	public Loot getChest() {
		return chest;
	}

	public void setChest(Loot chest) {
		this.chest = chest;
	}
	/**
	 * show all the loots leave on the floor to the user who can get back it .
	 * @param user the player who want pick up the loot leave on the floor 
	 */
	public void pickUpOnTheFloor (Player user){
		
	}
	
	public void getDescription (){
		
	}
}
