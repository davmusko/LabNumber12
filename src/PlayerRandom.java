import java.util.Random;

public class PlayerRandom extends Player {
	
	private Random random = new Random();

	public PlayerRandom() {
		super();
	}

	@Override
	public State getState() {
		int temp = random.nextInt(3);
		
		
		switch(temp) {
		case 0:
			return State.ROCK;
		case 1:
			return State.PAPER;
		case 2:
			return State.SCISSORS;
		default:
			return State.ROCK;
		
		}
	}
}
