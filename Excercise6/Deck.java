package tadasIvanauskas;

import java.util.ArrayList;
import java.util.Collections;
import java.security.SecureRandom;
import java.util.Locale;

/**
 * Created by hamekas on 10/13/16 @HKR ivanauskas15@gmail.com
 */
class Deck {
    private SecureRandom rand = new SecureRandom();
    private ArrayList<ArrayList> deck = new ArrayList<>();

    private enum suit {
        DIAMONDS("DIAMONDS"),
        CLUBS("CLUBS"),
        HEARTHS("HEARTHS"),
        SPADES("SPADES");
        String suit;

        suit(String suit) {
            this.suit = suit;
        }
    }

    private enum rank {
        ACE(1),
        TWO(2), THREE(3),
        FOUR(4), FIVE(5),
        SIX(6), SEVEN(7),
        EIGHT(8), NINE(9),
        TEN(10), JACK(11),
        QUEEN(12), KING(13);
        int rankNumber;
        rank(int rankNumber) {
            this.rankNumber = rankNumber;
        }


    }

    Deck() {
        for (suit suit : Deck.suit.values()) {
            for (rank rank : Deck.rank.values()) {
                ArrayList<Enum> card = new ArrayList<>();
                card.add(rank);
                card.add(suit);
                deck.add(card);
            }
        }
    }

    void showDeck() {
        deck.forEach(System.out::println);
        System.out.println(deck.size());
    }

    void shuffleDeck() {
        Collections.shuffle(deck);
    }

    ArrayList pickACard() {
        ArrayList card;
        card = deck.get(rand.nextInt(52 - 1));
        deck.remove(card);
        return card;
    }

    void putACard(ArrayList card) {
        deck.add(card);
        shuffleDeck();
    }

    Deck(String suit, String rank) {
        ArrayList<Enum> card = new ArrayList<>();
        try {
            card.add(Deck.suit.valueOf(suit.toUpperCase(Locale.ENGLISH)));
            card.add(Deck.rank.valueOf(rank.toUpperCase(Locale.ENGLISH)));
            deck.add(card);
        } catch (Exception e)

        {
            System.out.println("No such card");
        }
    }
}
