// https://www.codechef.com/submit/VALIDMIN

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
	        int a = input.nextInt();
	        int b = input.nextInt();
	        int c = input.nextInt();
	        if (a != b && b != c && a != c) {
	            System.out.println("No");
	        }else if (a == b && b == c && a ==c) {
	            System.out.println("Yes");
	        }
	        else if (a == b && c > b) {
	            System.out.println("Yes");
	        }else if (b == c && a > c) {
	            System.out.println("Yes");
	        }else if (a == c && b > c) {
	            System.out.println("Yes");
	        }else {
	            System.out.println("No");
	        }
	        t--;
	    }
	}
}
