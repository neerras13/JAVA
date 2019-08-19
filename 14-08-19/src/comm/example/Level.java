package comm.example;

public enum Level {
HIGH(3),
MEDIUM(2),
LOW(1);
	
	private int level;
	private Level(int levelcode) {
	this.level = levelcode;	
	}
}
