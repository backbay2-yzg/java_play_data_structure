package com.backbay2.code.排序.插入排序;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(arr);
        print(arr);
    }

    //todo 用临时变量记录标记项、去掉swap方法
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }


    //todo 使用swap交换
    public static void sort1(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
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
