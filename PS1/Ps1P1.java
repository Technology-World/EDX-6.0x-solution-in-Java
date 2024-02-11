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

/** Problem set: Assume s is a string of lower case characters.
 * Write a program that counts up the number of vowels contained in the string s. Valid vowels are: 'a', 'e', 'i', 'o', and 'u'.
 * For example, if s = 'azcbobobegghakl', your program should print: Number of vowels: 5 
 */

public class Ps1P1 {

    public static void main(String[] args) {
        String s[] = {"s", "e", "g", "u", "n", "b", "o", "b", "o", "b"};
        int count = 0;
        System.out.println(s.length);
        for (String item : s) {
            if (item == "a" || item == "e" || item == "i" || item == "o" || item == "u") {
                count = count + 1;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
