
public class Monster {
	protected int life;
	protected int lowerDamage;
	protected int higherDamage;
	
	public Monster (int life , int lowerDamage , int higherDamage){
		this.life = life ;
		this.lowerDamage = lowerDamage ;
		this.higherDamage = higherDamage ; 
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getLowerDamage() {
		return lowerDamage;
	}

	public void setLowerDamage(int lowerDamage) {
		this.lowerDamage = lowerDamage;
	}

	public int getHigherDamage() {
		return higherDamage;
	}

	public void setHigherDamage(int higherDamage) {
		this.higherDamage = higherDamage;
	}
	
}
