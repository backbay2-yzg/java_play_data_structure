package com.backbay2.code.排序.冒泡排序;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};

        sort(arr);
        print(arr);
    }

    public static void sort(int[] arr) {
        //todo 设置flag标识序列有序，达到最优O(n)，避免了有序的情况下无意义的循环判断。
        boolean flag = true;
        for (int i = arr.length - 1; i > 0 && flag; i--) {
            findMax(arr, i, flag);
        }
    }

    private static void findMax(int[] arr, int n, boolean flag) {

        for (int j = 0; j < n; j++) {
            flag = false;
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                flag = true;
            }
        }
    }

    private static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    private static void swap(int[] arr, int i, int minPosi) {
        int temp = arr[i];
        arr[i] = arr[minPosi];
        arr[minPosi] = temp;
    }
}
