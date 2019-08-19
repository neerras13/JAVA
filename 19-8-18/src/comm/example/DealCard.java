//Dealing cards to the players randomly
package comm.example;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class DealCard {
		private static Scanner scanner = new Scanner(System.in);

		public static void main(String args[]) {

			System.out.print("No Of Hands: ");
			int numHands = scanner.nextInt();
			System.out.print("Card per Hands: ");
			int cardsPerHand = scanner.nextInt();
			String[] suit = new String[] { "spades", "hearts", "diamonds", "clubs" };
			String[] rank = new String[] { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
			List<String> deck = new ArrayList<String>();
			for (int i = 0; i < suit.length; i++)
				for (int j = 0; j < rank.length; j++)
					deck.add(rank[j] + " of " + suit[i]);

			Collections.shuffle(deck);

			for (int i = 0; i < numHands; i++)
				System.out.println(dealHand(deck, cardsPerHand));
		}

		public static List<String> dealHand(List<String> deck, int n) {
			int deckSize = deck.size();
			List<String> handView = deck.subList(deckSize - n, deckSize);
			List<String> hand = new ArrayList<String>(handView);
			handView.clear();
			return hand;
		}
	}

