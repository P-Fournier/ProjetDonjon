
public class Potion implements Loot {
	protected int healingPoint ;
	
	public Potion (int healingPoint){
		this.healingPoint = healingPoint ;
	}

	public int getHealingPoint() {
		return healingPoint;
	}

	public void setHealingPoint(int healingPoint) {
		this.healingPoint = healingPoint;
	}
	/**
	 * add the healingPoint of the potion to the user's life ceil by the user maxLife
	 * @param user player who use the potion
	 */
	public void use (Player user){
		
	}
	/**
	 * add the potion to the inventory of the player 
	 * @param user player who pick up the potion 
	 */
	public void pickUp (Player user){
		
	}
	/**
	 * remove the potion from the user inventory and add it to the floor of the current room of
	 * the user 
	 * @param user player who throw down the potion
	 */
	public void throwDown (Player user){
		
	}
	
}
