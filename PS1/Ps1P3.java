/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodeeq;

/**
 *
 * @author Sodeeq Adeosun (Translated from Segun's python code)
 */

/** Write a program that prints the longest substring of s in which the letters occur in alphabetical order. 
 * For example, if s = 'azcbobobegghakl', then your program should print: Longest substring in alphabetical order is: beggh

* In the case of ties, print the first substring. 
* For example, if s = 'abcbcd', then your program should print: Longest substring in alphabetical order is: abc
*/
public class Ps1P3 {

    public static void main(String[] args) {
        String s = "onpeqrdvozgjogry";
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
        System.out.println("Longest Substring in alphabetical order is: " + answer);
    }
}
