package com.backbay2.code.排序.选择排序;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosi = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPosi = arr[j] < arr[minPosi] ? j : minPosi;
            }
            System.out.println("minPosi: " + minPosi);
            swap(arr, i, minPosi);
            print(arr, i);
        }
        System.out.println("算法结束！");
    }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosi = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPosi = arr[j] < arr[minPosi] ? j : minPosi;
            }
            swap(arr, i, minPosi);
        }
    }

    static void print(int[] arr, int i) {
        System.out.println("经过第" + i + "次循环之后，数组的内容为 : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("----------------------------");
    }

    static void swap(int[] arr, int i, int minPosi) {
        int temp = arr[i];
        arr[i] = arr[minPosi];
        arr[minPosi] = temp;

    }
}
