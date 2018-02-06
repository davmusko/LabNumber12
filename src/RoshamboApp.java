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
		System.out.println("Select your opponent:\n1) Rock Player\n2) Random Player");
		int playerType = scan.nextInt();
		if (playerType == 1) {
			opponentPlayer = new PlayerRock();
		}
		if (playerType == 2) {
			opponentPlayer = new PlayerRandom();
		}

		PlayerHuman humanPlayer = new PlayerHuman();
		humanPlayer.setName(name);

		Player.State userThrow = humanPlayer.getState();
		Player.State opponentThrow = opponentPlayer.getState();
		
		System.out.println(humanPlayer.getName()+"'s throw: " + userThrow);
		System.out.println("Opponent's throw: "+ opponentThrow);
		
		String results = matchResults(userThrow, opponentThrow);

		System.out.println(results);

	}

	private static String matchResults(Player.State userThrow, Player.State opponentThrow) {
		
		if (userThrow == opponentThrow) {
			return "Tie";
		}
		if ((userThrow == Player.State.ROCK && opponentThrow == Player.State.PAPER)
				|| (userThrow == Player.State.PAPER && opponentThrow == Player.State.SCISSORS)
				|| (userThrow == Player.State.SCISSORS && opponentThrow == Player.State.ROCK)) {
			return "Sorry, you lose!";
		}
		if ((userThrow == Player.State.ROCK && opponentThrow == Player.State.SCISSORS)
				|| (userThrow == Player.State.PAPER && opponentThrow == Player.State.ROCK)
				|| (userThrow == Player.State.SCISSORS && opponentThrow == Player.State.PAPER)) {
			return "WINNER, WINNER, CHICKEN DINNER!";
		}
		return "hi";

	}
}
