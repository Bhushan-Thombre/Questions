package com.company;

public class SkipString {
    public static void main(String[] args) {
        String str1 = "bccaappledah";
        String ans1 = skip(str1);
        String str2 = "bccappldah";
        String ans2 = skipAppNotApple(str1);
        String ans3 = skipAppNotApple(str2);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static String skip(String up) {
        if (up == "") {
            return "";
        }

        if (up.startsWith("apple")) {
            return skip(up.substring(5));
        }else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up == "") {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        }else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
