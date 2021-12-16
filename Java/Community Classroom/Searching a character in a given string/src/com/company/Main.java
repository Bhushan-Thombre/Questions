package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Enter a character: ");
        char l = input.next().charAt(0);
        System.out.println(search(name, l));
    }

    static boolean search(String str, char ch) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}