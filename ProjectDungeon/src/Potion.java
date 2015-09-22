
public class Potion extends Loot {
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
	public void use (Player user) throws Exception{
		super.use (user);
		System.out.print ("Your potion heal you by ");
		if (user.getLife()+this.healingPoint<user.getMaxLife()){
			user.setLife(user.getLife()+this.healingPoint);
			System.out.print (healingPoint);
		}else{
			System.out.print (user.getMaxLife()-user.getLife());
			user.setLife(user.getMaxLife());
		}
		System.out.println (" point(s) you got "+
				user.getLife()+" life point(s)");
	}
	public String toString (){
		return "Potion(s) "+this.healingPoint+" healing points";
	}
}
