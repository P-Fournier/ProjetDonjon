
public class Dungeon {
	
	protected Room exit ;
	protected Room entrance ;


	public Dungeon (String fichier){
		// création du donjon par un fichier ?
	}



	public Room getExit() {
		return exit;
	}


	public void setExit(Room exit) {
		this.exit = exit;
	}
	
	public Room getEntrance() {
		return entrance;
	}



	public void setEntrance(Room entrance) {
		this.entrance = entrance;
	}
}
