package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        String EncrypterKey = Integer.toString((int) (Math.random() * Integer.MAX_VALUE), 36);


        Scanner SecretConversation = new Scanner(System.in);
        System.out.println("Your encryption key = " + EncrypterKey);
        System.out.println("Please input your intended word");
        String word = SecretConversation.next();

        System.out.println("\n Would you like this message encrypted (Yes) or (No)");
        String determine = SecretConversation.next().toLowerCase();
        do {
            if (!determine.equals("yes")) {
                System.out.println("Please exit the program or type (Yes)");
                determine = SecretConversation.next().toLowerCase();
            } else if (determine.equals("yes"))
                break;
        } while (!determine.equals("yes"));
        System.out.println("Please type your encryption key");
        String EncyptingVerrification = SecretConversation.next();
        do {
            if (!EncrypterKey.equals(EncyptingVerrification)) {
                System.out.println("Your encryption key is not correct, please tyr again");
                EncyptingVerrification = SecretConversation.next();
            } else if (EncrypterKey.equals(EncyptingVerrification)) {
                break;
            }
        } while (!EncrypterKey.equals(EncyptingVerrification));
        String EncrypterKey2 = Integer.toString((int) (Math.random() * Integer.MAX_VALUE), 36);
        System.out.println("Congrats, your message has been encypted, to view the message latter, please use decryption key " + EncrypterKey2);
        System.out.println("\n\n When you'd like to view the hidden message please type (View)");
        String ab = SecretConversation.next().toLowerCase();
        do {
            if (!ab.equals("view")) {
                System.out.println("If you'd like to see your message, please type (View)");
                ab = SecretConversation.next().toLowerCase();
            } else if (ab.equals("view")) {
                break;
            }
        } while (!ab.equals("view"));
        System.out.println("Congragilations, here's your message: " + word);


    }
}
public class Control {
    public String word}



}


