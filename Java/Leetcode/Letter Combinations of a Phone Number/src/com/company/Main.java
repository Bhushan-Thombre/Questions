// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padRet("", "12"));
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        List<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(padRet(p + ch, up.substring(1)));
        }

        return ans;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }

}