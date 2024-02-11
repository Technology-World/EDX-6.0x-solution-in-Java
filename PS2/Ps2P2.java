/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodeeq;

import java.util.*;
/**
 *
 * @author Sodeeq Adeosun (Translated from Segun's python code)
 */

/*
* # Now write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months.
# By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be
# paid each month.

# In this problem, we will not be dealing with a minimum monthly payment rate.

# The following variables contain values as described below:
# balance - the outstanding balance on the credit card
# annualInterestRate - annual interest rate as a decimal

# The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:
# Lowest Payment: 180

# Assume that the interest is compounded monthly according to the balance at the end of the month (after the payment for that month is
# made).
# The monthly payment must be a multiple of $10 and is the same for all months. Notice that it is possible for the balance to become
# negative using this payment scheme, which is okay. A summary of the required math is found below:
# Monthly interest rate = (Annual interest rate) / 12.0
# Monthly unpaid balance = (Previous balance) - (Minimum fixed monthly payment)
# Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)

*/
public class Ps2P2 {

    public static double funGetFixedMinimum(double balance, double annualInterestRate, double mimiumFixed) {
        double previousBalance = balance;
        double updatedBalanceEachMonth = 0.0;
        for (int i = 1; i <= 12; i++) {
            double monthlyRate = annualInterestRate / 12.0;
            double monthlyUnpaidBalance = previousBalance - mimiumFixed;
            updatedBalanceEachMonth = monthlyUnpaidBalance + (monthlyRate * monthlyUnpaidBalance);
            previousBalance = updatedBalanceEachMonth;
        }
        return updatedBalanceEachMonth;
    }

    public static void main(String[] args) {
        double balance;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        balance = in.nextDouble();
        double annualInterestRate;
        System.out.print("Enter Anuual Interest Rate: ");
        annualInterestRate = in.nextDouble();
        int minPay = 10;
        double endOfYear = funGetFixedMinimum(balance, annualInterestRate, minPay);
        while (endOfYear > 0) {
            minPay += 10;
            endOfYear = funGetFixedMinimum(balance,annualInterestRate, minPay);
        }
        System.out.println("Lowest Payment: " + minPay);
    }
}
