package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(linearSearch(arr, 4, 0));
        System.out.println(LS(arr, 4, 0));
        System.out.println(LSLast(arr, 4, arr.length - 1));
        LSAll(arr, 4, 0);
        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);

        System.out.println(findAllIndex2(arr, 4, 0));
    }

    // Returns true or false
    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return (arr[index] == target || linearSearch(arr,target, index + 1));
    }

    // Returns the index at which the target is present
    static int LS(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else {
            return LS(arr, target, index + 1);
        }
    }

    static int LSLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else {
            return LSLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void LSAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        LSAll(arr, target, index + 1);
    }

    // Here Arraylist is passed in the parameter so a new list is not created every time the function is called instead
    // changes made in the list will occur in all the reference variable
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // Here Arraylist is not passed as parameter instead a new Arraylist is created every time a function is called so
    // the changes made to the list in the function will not reflect in other function calls
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // This will contain answer to that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndex2(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}