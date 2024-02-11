/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodeeq;

/**
 *
 * @author Sodeeq Adeosun
 */
import java.util.Scanner;

public class Ps1 {

    public static void printMenu() { // declaring method printmenu
        System.out.println("1. Count vowels\n2. Count bob\n3. Check longest substring"); // menu items
        System.out.println("4. Exit the program\n5. Print menu\n6. Clear Screen");// menu items
    }

    public static int fetchNextNumber(String prompt, Scanner in) { // declaring method to accept number from the user
        System.out.print(prompt); // collecting variable from user
        return in.nextInt();
    }

    public static void main(String[] args) {
        int count = 0;
        String s;
        int x; // value to be declared by the usser
        printMenu(); // list the menu item options
        Scanner input = new Scanner(System.in); // create scanner to obtain input from command window
        String prompt = "Select menu item : "; // asking user to select operation
        boolean runProgram = true; // prompt user to select menu option again after executing the
        // first menu selected by the user

        while (runProgram) {
            x = fetchNextNumber(prompt, input);
            if (x == 1) {
                //part 1, count vowels 
                System.out.print("Enter the value of s to count number of vowels: ");
                s = input.next();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                        count = count + 1;
                    }
                }
                System.out.println("Number of vowels: " + count + "\n");
            } else if (x == 2) {
                //part 2, count bob
                System.out.print("Enter the value of s to count number of times bob occur: ");
                s = input.next();
                count = 0;
                for (int i = 0; i < s.length() - 2; i++) {
                    if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                        count = count + 1;
                    }
                }
                System.out.println("Number of times bob occur: " + count + "\n");
            } else if (x == 3) {
                //part 3, substring
                System.out.print("Enter the value of s for the longest substring in alphabetical order: ");
                s = input.next();
                String answer = "";
                String substr = "";
                for (int i = 0; i < s.length(); i++) {
                    if (substr.length() != 0) {
                        if (s.charAt(i) >= substr.charAt(substr.length() - 1)) {
                            substr += s.charAt(i);
                        } else {
                            if (answer.length() < substr.length()) {
                                answer = substr;
                            }
                            substr = Character.toString(s.charAt(i));
                        }
                    } else {
                        substr = Character.toString(s.charAt(i));
                    }
                }
                if (answer.length() < substr.length()) {
                    answer = substr;
                }
                System.out.println("Longest Substring in alphabetical order is: " + answer + "\n");
            } else if (x == 4) {
                //do quit
                System.out.println("Bye Bye!");
                runProgram = false; // terminate menu option selection request after execution
            } else if (x == 5) {
                // display menu option
                printMenu();
            } else if (x == 6) {
                //clear screen
                for (int i = 0; i < 1; i++) {
                    System.out.println("\n");
                }
            } else if (x > 6) {
                // invalid menu option
                System.out.println("Wrong menu selection, please choose printMenu to see legal options. Press 4 to choose PrintMenu");
            }
        }
    }
}
