package com.backbay2.code.排序.归并排序;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 3, 6, 9, 5, 2, 10};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left == right) return;
        //分成两半
        int mid = left + (right - left) / 2;
        //左边排序
        sort(arr, left, mid);
        //右边排序
        sort(arr, mid + 1, right);

        merge(arr, left, mid + 1, right);
    }

    private static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;
        while (i <= mid && j <= rightBound) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
           /* if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
//                i++;
//                k++;
            } else {
                temp[k++] = arr[j++];
//                j++;
//                k++;
            }*/
        }
        /**
         * 处理极端情况
         */
        //mid右半边均小于左半边且遍历存储完，左边仍有剩余
        while (i <= mid) temp[k++] = arr[i++];
        //mid左半边均小于右半边且遍历存储完，右边仍有剩余
        while (j <= rightBound) temp[k++] = arr[j++];
//        print(temp);
        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr + m] = temp[m];
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
