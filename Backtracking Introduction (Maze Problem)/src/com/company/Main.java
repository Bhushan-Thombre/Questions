package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
        path("", 3, 3);
        System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
        System.out.println();
        boolean[][] board1 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board1, 0, 0);
        System.out.println();
        System.out.println();
        System.out.println();
        int[][] path = new int[board1.length][board1[0].length];
        allPathPrint("", board1, 0, 0, path, 1);
    }

    static int mazeCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = mazeCount(r - 1, c);
        int right = mazeCount(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(pathRet(p + 'D', r - 1, c));
        }

        if (c > 1) {
            ans.addAll(pathRet(p + 'R', r, c - 1));
        }

        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(pathRetDiagonal(p + "D", r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(pathRetDiagonal(p + "V", r - 1, c));
        }

        if (c > 1) {
            ans.addAll(pathRetDiagonal(p + "H", r, c - 1));
        }

        return ans;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }


    // Backtracking Introduction

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }



    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr:
                 path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
