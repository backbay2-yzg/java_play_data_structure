package com.backbay2.code.排序.递归示例;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    static long f(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + f(n - 1);


    }
}
