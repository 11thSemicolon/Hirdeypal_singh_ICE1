/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Hirdeypal Singh
 * 991716545
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand =  new Random();
        Scanner scan = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i] = c;
            
            System.out.println(c.getValue()+" "+ c.getSuit());
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit(Card.SUITS[3])
        
        
        // and search magicHand here
        //Then report the result here
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
        System.out.println("Your card is in the magic hand!");
        found = true;
        break;
        }
        }
        if (!found) {
            System.out.println("Your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
