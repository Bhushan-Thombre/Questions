// https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String t = "";
        String t1 = s.substring(0, 2);
        int t2 = Integer.parseInt(t1);
        String t3 = s.substring(2, 8);
        char an = s.charAt(8);

        if (an == 'A') {
            if (t2 == 12) {
                String t4 = "00";
                t = t4.concat(t3);
            }else {
                t = s.substring(0, 8);
            }
        }else if (an == 'P') {
            if (t2 == 12) {
                t = s.substring(0, 8);
            }else {
                t2 = t2 + 12;
                if (t2 > 24) {
                    t2 = t2 - 24;
                }
                String t4 = "" + t2;
                t = t4.concat(t3);
            }
        }

        return t;


    }

}

