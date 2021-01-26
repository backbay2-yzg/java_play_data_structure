package com.backbay2.code.排序;

import com.backbay2.code.排序.冒泡排序.BubbleSort;
import com.backbay2.code.排序.希尔排序.ShellSort;
import com.backbay2.code.排序.归并排序.MergeSort;
import com.backbay2.code.排序.插入排序.InsertionSort;
import com.backbay2.code.排序.选择排序.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class DataChecker {

    public static void main(String[] args) {
        check();
    }

    private static void check() {
        int[] arr = generateRandomArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.sort(arr);
        //SelectionSort.sort(arr2);
        //BubbleSort.sort(arr2);
        //InsertionSort.sort1(arr2);
        //ShellSort.sort(arr2);
        MergeSort.sort(arr2, 0, arr2.length - 1);

        boolean same = true;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i])
                same = false;
        }
        System.out.println(same == true ? "right" : "wrong");
    }

    private static int[] generateRandomArray() {
        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;

    }
}
