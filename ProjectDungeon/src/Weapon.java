
public class Weapon extends Loot {
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
	public void use (Player user) throws Exception{
		super.use(user);
		user.getInventory().put(user.getEquiped(),user.getInventory().get(user.getEquiped())+1); // on range l'arme équipé dans l'inventaire
		user.setEquiped(this);
	}
	public String toString (){
		return this.name+" "+this.bonusDamage+" damage points";
	}
}
