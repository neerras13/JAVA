package comm.example;

public class Card {

	private SuitEnum s;
	private RankEnum r;
	public Card(SuitEnum s, RankEnum r) {
		super();
		this.s = s;
		this.r = r;
	}
	public SuitEnum s() {
		return this.s;
	}
	public RankEnum r() {
		return this.r;
	}
	@Override
	public String toString() {
		return "Card [suit=" + s + ", rank=" + r + "]\n";
	}
	
}
