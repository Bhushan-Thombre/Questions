package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        int lcm = lcm(a);
        int gcd = gcd(b);
        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;
            if (gcd % multiple == 0) {
                result++;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

    public static int gcd(List<Integer> arr) {
        int res = arr.get(0);
        for (int i = 1; i< arr.size(); i++) {
            res = gcd(res, arr.get(i));
        }
        return res;
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        return lcm;
    }

    public static int lcm(List<Integer> arr) {
        int res = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            res = lcm(res, arr.get(i));
        }
        return res;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
