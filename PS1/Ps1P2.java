/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor`
 */
package sodeeq;

/**
 *
 * @author Sodeeq Adeosun
 */

 /** Assume s is a string of lower case characters.
  * Write a program that prints the number of times the string 'bob' occurs in s. 
  * For example, if s = 'azcbobobegghakl', then your program should print: Number of times bob occurs is: 2 
*/
public class Ps1P2 {

    public static void main(String[] args) {
        String s = "hdgbobbobbboboiaS";
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                count = count + 1;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
