package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Using iteration");
	    pattern1(6);
        System.out.println();
        pattern2(6);
        System.out.println();
        pattern3(6);
        System.out.println();
        pattern4(6);
        System.out.println();
        pattern5(6);
        System.out.println();
        pattern6(6);
        System.out.println();
        pattern7(6);
        System.out.println();
        pattern8(6);
        System.out.println();
        pattern9(6);
        System.out.println();
        pattern10(6);
        System.out.println();
        System.out.println("Using Recursion");
        triangle1(6, 0);
        System.out.println();
        triangle2(6, 0);
    }


    // Iteration
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            for (int j = 1; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int s = 0; s <= n - c; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    // Recursion

    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle1(r, c + 1);
        }else {
            System.out.println();
            triangle1(r - 1, 0);
        }
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");
        }else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }
}
