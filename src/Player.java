
public abstract class Player {
	private String name;
	public enum State{ROCK, PAPER, SCISSORS};

	public Player() {
		
	}
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract State getState();
	
}
	


