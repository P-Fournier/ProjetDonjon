import java.util.Scanner;

public class Dungeon {
	
	protected String currentRoom = "entrance";
	protected boolean gameIsFinished = false;
	protected final Scanner scanner = new Scanner(System.in);
	
	protected Room exit ;
	
	public Dungeon(){
		
	}
	
	public String getCurrentRoom(){
		return currentRoom;
	}
	
	public void interpretCommand(String command){
		String[]cmd = command.split("",2);
		switch(cmd[0]){
		case "go" :
			/*Room newRoom = currentRoom.go(cmd[1]);
			if (newRoom == null){
				System.out.println("Error");
			}
			else{
				currentRoom = newRoom;
			}
			*/
			break;
		default :
			System.out.println("I don't know what you mean");
		}
	}
	
	public void start(){
		do{
			System.out.println("You are in " + getCurrentRoom());
			System.out.println("What do you want to do ?");
			System.out.print("> ");
			
			//read a command from the user
			String line = scanner.nextLine();
			interpretCommand(line);
		}while(!gameIsFinished());
		System.out.println("You are in "+ getCurrentRoom());
		if (gameIsWon()){
			System.out.println("You win !!");
		}
		else{
			System.out.println("You loose !!");
		}
	}
	
	public boolean gameIsFinished(){
		return gameIsLost() || gameIsWon();
	}
	
	public boolean gameIsLost(){
		return currentRoom.equals("trap");
	}
	
	public boolean gameIsWon(){
		return currentRoom.equals("exit");
	}
	
	
	/*public Dungeon (String fichier){
		// création du donjon par un fichier ?
	}*/



	public Room getExit() {
		return exit;
	}


	public void setExit(Room exit) {
		this.exit = exit;
	}
}
