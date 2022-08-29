// https://www.codechef.com/submit/ATM2

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t != 0) {
		    int n = input.nextInt();
		    int k = input.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		        arr[i] = input.nextInt();
		    }
		    for (int j = 0; j < n; j++) {
		        if (arr[j] <= k) {
		            System.out.print("1");
		            k = k - arr[j];
		        }else {
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		    t--;
		}
	}
}
