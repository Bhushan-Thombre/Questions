package com.company;

public class InArguments {

    public static void main(String[] args) {
        String str = "bccadah";
        skip("", str);

    }

    static void skip(String p, String up) {
        if (up == "") {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        }else {
            skip(p + ch, up.substring(1));
        }
    }
}
