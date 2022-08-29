// https://www.hackerrank.com/challenges/java-currency-formatter/problem
package com.company;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("INDIA: " + india.format(payment));
        System.out.println("CHINA: " + china.format(payment));
        System.out.println("FRANCE: " + france.format(payment));
    }
}