// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

package com.company;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t = input.next();
        String time[] = t.split(":");
        String AMPM = time[2].substring(2, 4);
        String checkPm = "PM";
        String checkAm = "AM";
        int hr, min, sec;
        hr = Integer.parseInt(time[0]);
        min = Integer.parseInt(time[1]);
        sec = Integer.parseInt(time[2].substring(0, 2));
        int h = hr;
        if (AMPM.equals(checkAm) && hr == 12) {
            h = 0;
        }else if (AMPM.equals(checkPm) && hr < 12) {
            h = h + 12;
        }
        System.out.printf("%02d:%02d:%02d", h, min, sec);
    }
}
