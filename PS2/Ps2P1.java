/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodeeq;

/*
 *
 * @author Sodeeq Adeosun
 */

/*
 * # Write a program to calculate the credit card balance after one year if a person only pays the minimum monthly payment required by the
# credit card company each month.

# The following variables contain values as described below:
# balance - the outstanding balance on the credit card
# annualInterestRate - annual interest rate as a decimal
# monthlyPaymentRate - minimum monthly payment rate as a decimal

# For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, print out the remaining
# balance. Be sure to print out no more than two decimal digits of accuracy - so print

# Remaining balance: 813.41
# instead of
# Remaining balance: 813.4141998135

# So your program only prints out one thing: the remaining balance at the end of the year in the format:
# Remaining balance: 4784.0

# A summary of the required math is found below:
# Monthly interest rate= (Annual interest rate) / 12.0
# Minimum monthly payment = (Minimum monthly payment rate) x (Previous balance)
# Monthly unpaid balance = (Previous balance) - (Minimum monthly payment)
# Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
 */
import java.util.Scanner;

public class Ps2P1 {

    public static void main(String[] args) {
        double previousBalance;
        double monthlyPaymentRate;
        double annualInterestRate;

        double monthlyInterestRate ;
        double minimumMonthlyPayment ;
        double monthlyUnpaidBalance ;
        double updatedBalance ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        previousBalance = in.nextDouble();

        System.out.print("Enter Anuual Interest Rate: ");
        annualInterestRate = in.nextDouble();

        System.out.print("Enter Monthly Payment Rate: ");
        monthlyPaymentRate = in.nextDouble();

        for (int i = 1; i <= 12; i++) {
            monthlyInterestRate = annualInterestRate / 12.0;
            minimumMonthlyPayment = monthlyPaymentRate * previousBalance;
            //System.out.println("minimum Monthly payment: " + minimumMonthlyPayment); // output the minimum monthly amount to deposit
            monthlyUnpaidBalance = previousBalance - minimumMonthlyPayment;
            updatedBalance = (monthlyUnpaidBalance) + (monthlyInterestRate * monthlyUnpaidBalance);
            //System.out.println("Month " + i + " remaining previousBalance: " + updatedBalance); // showing the remaining balance after each monthl deduction

            previousBalance = updatedBalance;

        }
        //System.out.println("Remaining Balance: " + previousBalance); // Annual remaining balance in full digits
        
        System.out.printf("Remaining Balance:  %.2f" , previousBalance); //Annual remaining balance formatted to 2 decimal places

    }
}
