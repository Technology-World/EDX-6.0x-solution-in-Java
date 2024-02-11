/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodeeq;

import java.util.Scanner;

/**
 *
 * @author Sodeeq Adeosun (Translated from Segun's python code)
 */
public class Ps2P3 {

    public static void main(String[] args) {
        double balance;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        balance = in.nextDouble();
        double annualInterestRate;
        System.out.print("Enter Anuual Interest Rate: ");
        annualInterestRate = in.nextDouble();
        double monthyRate = annualInterestRate / 12.0;
        double lowPay = balance / 12;
        double highPay = balance * Math.pow((1 + monthyRate), 12) / 12.0;
        double minPay = (lowPay + highPay) / 2;
        double endOfYear = Ps2P2.funGetFixedMinimum(balance, annualInterestRate, minPay);
        while (Math.abs(endOfYear) >= 0.01) {
            if (endOfYear > 0) {
                lowPay = minPay;
            } else {
                highPay = minPay;
            }
            minPay = (lowPay + highPay) / 2;
            endOfYear = Ps2P2.funGetFixedMinimum(balance, annualInterestRate, minPay);
        }
        System.out.printf("Lowest Payment:  %.2f", minPay);
    }
}
