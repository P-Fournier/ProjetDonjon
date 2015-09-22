import java.util.Scanner;


public abstract class Loot {
	static Scanner sc = new Scanner (System.in);
	public void use (Player user) throws Exception {
		user.removeFromInventory(this);
	}
	public void chooseAction (Player user){
		System.out.println ("You choose "+this+" , select an action : ");
		System.out.println ("You can \"use\" it ");
		System.out.println ("Or \"throw down\" it ");
		System.out.println ("Or just \"cancel\" ");
		boolean action = false ;
		do {
			action = true;
			String choose = sc.nextLine();
			switch (choose){
				case "use":
					try {
						this.use(user);
					}catch (Exception e){
						System.out.println(e);
					}
					break;
				case "throw down":
					try {
						this.throwDown(user);
					}catch (Exception e){
						System.out.println(e);
					}
					break;
				case "cancel":
					break;
				default :
					System.out.println("This action doesn't exist");
					action=false;
			}
		}while (!action);
	}
	public void throwDown (Player user) throws Exception{
		System.out.println("throw down");
		user.removeFromInventory(this);
		if (user.getCurrentRoom().getOnTheFloor().containsKey(this)){
			user.getCurrentRoom().getOnTheFloor().put(this,user.getCurrentRoom().getOnTheFloor().get(this) + 1 );
		}else{
			user.getCurrentRoom().getOnTheFloor().put(this, 1);
		}
		System.out.println("You throw down "+this+" on the floor");
	}
}
