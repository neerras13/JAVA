package comm.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private static SuitEnum suit;
	private static RankEnum rank;
	private static List<Card> proto = new ArrayList<Card>(); 
    static
    {
    	for(SuitEnum s : suit.values()){
    		for(RankEnum r : rank.values()){
        	proto.add(new Card(s, r));
    		}
    	}
    }
    
    public static void main(String[] args)
    {
    	System.out.println(proto);
    }
}
