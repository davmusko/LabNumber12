import java.util.Scanner;

public class PlayerHuman extends Player{
	Scanner scan = new Scanner(System.in);
	
	public PlayerHuman() {
	}
	
	public PlayerHuman(String name) {
		super(name);
	}



	@Override
	public State getState() {
		System.out.println("Please pick (R)ock, (P)aper, or (S)cissors");
		char userState = scan.next().toLowerCase().charAt(0);
		switch(userState) {
		case 'r':
			return State.ROCK;
		case 'p':
			return State.PAPER;
		case 's':
			return State.SCISSORS;
		default:
			System.out.println("Sorry, invaild input!");
			return getState();
		}
		
	}


	
	}


