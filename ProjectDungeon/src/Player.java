import java.util.*;
public class Player {
	protected int life ;
	protected int maxLife ;
	protected HashMap <Loot,Integer> inventory ; // taille maximum de l'inventaire
	protected Weapon equiped ;
	protected Room currency;
	/*
	 * protected int level ;
     * protected int experience ;
	 * protected int lowerDamage ;
	 * protected int higherDamage ;
	*/
	public Player (){
		
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
	
	public void setInventory(HashMap<Loot, Integer> inventory) {
		this.inventory = inventory;
	}
	
	public Weapon getEquiped() {
		return equiped;
	}
	
	public void setEquiped(Weapon equiped) {
		this.equiped = equiped;
	}
	public Room getCurrency() {
		return currency;
	}


	public void setCurrency(Room currency) {
		this.currency = currency;
	}
}
