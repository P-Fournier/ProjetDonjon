
public class Key extends Item {
	
	
	/**
	 * montre toute les portes vérouillés dans la salle de l'utilisateur , il peux décider d'en ouvrir
	 * une si il veut , la cle est alors retirer de son inventaire / possibilité d'annuler
	 * @param user utilisateur qui utilise la cle
	 * @return vrai si on a effectuer l'action
	 */
	public boolean use (Player user) throws Exception {
		System.out.println("This is the locked door that you can unlock \n");
		user.getCurrentRoom().showLockedKeyDoor();
		System.out.println("you can also cancel your use \n");
		boolean test = false ;
		String select ;
		do {
			select = sc.next();
			test = (((user.getCurrentRoom().getExit().containsKey(select))&&(!user.getCurrentRoom().getExit().get(select).lockedKey))
					||(!select.equals("cancel")));
			if (!test){
				System.out.println("Invalid command");
			}
		}while (!test);
		if (!select.equals("cancel")){
			user.getCurrentRoom().getExit().get(select).setLockedKey(false);
			user.removeFromInventory(this);
			return true ;
		}else{
			return false;
		}
	}
	public String toString (){
		return "Key(s)";
	}
}
