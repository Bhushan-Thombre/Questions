// https://www.hackerrank.com/challenges/one-week-preparation-kit-recursive-digit-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-four
package com.company;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {

        // int sum = 0;
        // for (int i = 0; i < n.length(); i++) {
        //     sum += Integer.parseInt(n.charAt(i) + "");
        // }
        // sum = superSingleDigit(sum * k);
        // return sum;

        n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";
        return (n.length() > 1) ? superDigit(n, 1) : Character.getNumericValue(n.charAt(0));

    }

    // public static int superSingleDigit(int num) {
    //     if (num < 10) {
    //         return num;
    //     }else {
    //         int n = 0;
    //         while (num > 0) {
    //             n += num % 10;
    //             num = num / 10;
    //         }
    //         return superSingleDigit(n);
    //     }
    // }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
