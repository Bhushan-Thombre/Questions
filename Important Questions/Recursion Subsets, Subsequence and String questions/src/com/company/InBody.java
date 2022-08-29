package com.company;

public class InBody {
    public static void main(String[] args) {
        String str = "bccadah";
        String ans = skip(str);
        System.out.println(ans);
    }

    static String skip(String up) {
        if (up == "") {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }
    }
}
