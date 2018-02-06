import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		PlayerRock playerRock;
        PlayerRandom playerRandom;
        Player opponentPlayer = null;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Roshambo Game!");
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Select your opponent:\n1) Rock Player\n2)Random Player");
		int playerType = scan.nextInt();
		if (playerType == 1) {
			opponentPlayer = new PlayerRock();
		}
		if (playerType == 2) {
			opponentPlayer = new PlayerRandom();
		}

		PlayerHuman humanPlayer = new PlayerHuman();
		humanPlayer.setName(name);

		
		//System.out.println(opponentPlayer.getState());
	       String results = matchResults(humanPlayer, opponentPlayer);
	        
	        System.out.println(results);
	        
	    }

	    private static String matchResults(PlayerHuman user, Player opponentPlayers) {
	        if (user.getState().equals(opponentPlayers.getState())) {
	        	return "Tie";
	        }
	        return null;
	}
}
