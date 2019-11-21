import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Card> playerHands = new ArrayList<Card>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<Integer> winners = new ArrayList<Integer>();
        Deck deck = new Deck();
        deck.shuffle();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Players: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        for (int i = 1; i <= number; i++) {
            playerHands.add(deck.dealCard());
            System.out.println("Player " + i + ": " + playerHands.get(i - 1).getSuit() + " " + playerHands.get(i - 1).getRank());
            values.add(playerHands.get(i-1).getValueFromEnum());
        }

        for (Card card : playerHands) {
            if (Collections.max(values)==card.getValueFromEnum()){
                winners.add(playerHands.indexOf(card)+1);
            }

        }
        if (winners.size() == 1) {
            System.out.println("Player " + winners.get(0) + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    }

