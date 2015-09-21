
public class Weapon implements Loot {
	protected int bonusDamage ;
	protected String name ;
	
	public Weapon (String name , int bonusDamage ){
		
		this.name = name;
		this.bonusDamage = bonusDamage ;
		
	}

	public int getBonusDamage() {
		return bonusDamage;
	}

	public void setBonusDamage(int bonusDamage) {
		this.bonusDamage = bonusDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * equip the weapon to the user
	 * @param user player who use the weapon
	 */
	public void use (Player user){
		
	}
	/**
	 * add the weapon to the inventory of the user
	 * @param user player who pick up the weapon 
	 */
	public void pickUp (Player user){
		
	}
	/**
	 * remove the weapon from the user inventory to the floor of the current of the user
	 * @param user player who throw down the user
	 */
	public void throwDown (Player user){
		
	}
	
}
