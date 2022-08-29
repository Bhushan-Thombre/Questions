// https://www.codechef.com/submit/EZSPEAK

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
		    int count = 0;
		    int n = input.nextInt();
		    String str = input.next();
		    boolean is = true;
		    for (int i = 0; i < str.length(); i++) {
		        if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' ) {
		            count++;
		        } else {
		            count = 0;
		        }
		        
		        if (count >= 4) {
		            is = false;
		            break;
		        }
		    }
		    if (is) {
		        System.out.println("Yes");
		    }else {
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
