package com.backbay2.code.排序.希尔排序;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(arr);
        print(arr);
    }

    public static void sort(int[] arr) {
//        for (int gap = arr.length/2; gap > 0; gap /= 2)
        int h = 1;
        while (h < arr.length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3)
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
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
