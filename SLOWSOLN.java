// https://www.codechef.com/submit/SLOWSOLN

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
            int maxT = input.nextInt();
            int maxN = input.nextInt();
            int sumN = input.nextInt();
            int ans = 0;
		    int min = 1;
            while (maxT != 0 && sumN != 0) {
                if (maxN < sumN) {
                    min = maxN;
                    ans += min * min;
                    sumN -= min;
                    maxT--;
                }else {
                    min = sumN;
                    ans += min * min;
                    sumN -= min;
                    maxT--;
                }
            }
            System.out.println(ans);
		    t--;
		}
	}
}
