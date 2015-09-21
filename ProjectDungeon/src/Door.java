
public class Door {
	protected boolean visible;
	protected boolean lockedKey;
	protected boolean lockedMonster;
	
	public Door (boolean visible , boolean lockedKey , boolean lockedMonster){
		this.visible = visible ;
		this.lockedKey = lockedKey ;
		this.lockedMonster = lockedMonster ;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isLockedKey() {
		return lockedKey;
	}

	public void setLockedKey(boolean lockedKey) {
		this.lockedKey = lockedKey;
	}

	public boolean isLockedMonster() {
		return lockedMonster;
	}

	public void setLockedMonster(boolean lockedMonster) {
		this.lockedMonster = lockedMonster;
	}
	
}
