// Note: This program makes a lot of references attempting to be funny but miserably failing.

import java.util.Scanner;
public class ChatCensor {
    public static void main (String[] args) {
        Scanner rodofDISCORD = new Scanner(System.in);
        String[] censorWords = {"fuck", "shit", "hell", "bitch", "asshole"};
        String chat = "";
        int curses = 0;
        while (curses < 5) {
            System.out.print("Type in chat: ");
            chat = rodofDISCORD.nextLine();
            for (int i = 0; i < censorWords.length; i++) {
                if (chat.contains(censorWords[i])) {
                    curses++;
                    System.out.println("Warning! Your censor count has blurred Nameless Deity some more and is making him blind to the rod of Discord.\nYou have " + (5-curses) + " free Car Pal references left before you will be sent to the shadow realm.");
                }
            }
        }
        System.out.println("\nCongratulations for your free ticket to Car Pal's soapbox race! You cannot opt out of this complimentary reward for 'enlightening' Xeroc...NOW GO TO THE " + censorWords[(int) (Math.random() * 5)].toUpperCase() + "ING SHADOW REALM.");
    }
}
