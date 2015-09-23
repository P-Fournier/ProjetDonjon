
public class Weapon extends Item {
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
	 * @return vrai si on a effectuer l'action 
	 */
	public boolean use (Player user) throws Exception{
		user.removeFromInventory(this);
		if (user.getEquiped()!=null){
			user.getInventory().put(user.getEquiped(),user.getInventory().get(user.getEquiped())+1); // on range l'arme équipé dans l'inventaire
		}
		user.setEquiped(this);
		return true;
	}
	public String toString (){
		return this.name+" "+this.bonusDamage+" damage points";
	}
}
