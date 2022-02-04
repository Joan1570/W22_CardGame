
import java.util.Scanner;
import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joanna 
 */
public class CardTrick {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Select any Number");
       
        Card[] magicHand =new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card() {
                @Override
                public ATR getATR() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public String getProtocol() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public CardChannel getBasicChannel() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public CardChannel openLogicalChannel() throws CardException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void beginExclusive() throws CardException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void endExclusive() throws CardException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public byte[] transmitControlCommand(int controlCode, byte[] command) throws CardException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void disconnect(boolean reset) throws CardException {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
        }
        for (int i=0; i<magicHand.length; i++){
            int index=(int)(Math.random()*magicHand.length);
            Card temp = magicHand[i];
            magicHand[i]=magicHand[index];
            magicHand[index]=temp;
        }
        for (int i=0; i<magicHand.length;i++) {
           
           
            //String suit = suits[magicHand[i] / 13];
            
           // String value = ranks[magicHand[i] % 13];
           // System.out.println("Card Number " + magicHand[i] + " : " + value + " of " + suit);
        }
        System.out.println("Please select any number");
        int x=input.nextInt();
       // if(x==deck.length){
            System.out.println("The value is there");
       // }
       // else {
         //   System.out.println("The number you put is not in the random numbers");
       // }
       
       System.out.println("Hi, my name is Joanna He. I'm studing Diploma in Computer Programming at Sheridan College!");
        
    }
    
}
