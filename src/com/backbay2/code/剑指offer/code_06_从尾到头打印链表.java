package com.backbay2.code.剑指offer;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 限制：0 <= 链表长度 <= 10000
 */


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class code_06_从尾到头打印链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(2);

        head.next = secondNode;
        secondNode.next = thirdNode;
        printNode(head);
        Solution02 solution02 = new Solution02();
        int[] arr = solution02.reversePrint(head);
        printArray(arr);
    }

    static void printNode(ListNode head) {
        System.out.println("--------ListNode----------");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void printArray(int[] arr) {

        System.out.println("--------数组----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}


/**
 * todo 解法一：递归解法
 */
class Solution01 {
    ArrayList<Integer> temp = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        recursive(head);
        int[] arr = new int[temp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
        }
        return arr;
    }

    public void recursive(ListNode head) {
        if (head == null) return;
        recursive(head.next);
        temp.add(head.val);
    }
}

/**
 * todo 解法二: 栈（先入后出）
 */
class Solution02 {
    LinkedList<Integer> stack = new LinkedList<>();

    public int[] reversePrint(ListNode head) {
        while (head != null) {
            //stack.add(head.val); add()同addLast()
            stack.addLast(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        System.out.println(stack.size());
        //这里犯了一个错，遍历的条件写成stack.size()，错误原因:每循环一次执行removeLast()方法都会使得stack-1.第二次之后大小为1,以至于条件不成立arr:1< stack:1,所以只会输出arr[0],arr[1],arr[2]为0（初始化值）
        for (int i = 0; i < stack.size(); i++) {
            //linkedList.removeLast()方法作用：移除并且返回最后一个这个列表的最后元素
            arr[i] = stack.removeLast();
        }
        return arr;
    }
}




