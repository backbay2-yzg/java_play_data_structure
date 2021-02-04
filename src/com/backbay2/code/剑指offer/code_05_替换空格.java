package com.backbay2.code.剑指offer;


/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 * 限制： 0 <= s 的长度 <= 10000
 */
public class code_05_替换空格 {

    /**
     * Java 等语言中，字符串都被设计成「不可变」的类型，
     * 即无法直接修改字符串的某一位字符，需要新建一个字符串实现。
     * <p>
     * 算法流程：
     * 1.初始化一个 StringBuilder (Java) ，记为 sb ；
     * 2.遍历列表 s 中的每个字符 char ：
     * 3.当 char 为空格时：向 sb 后添加字符串 "%20" ；当 char 不为空格时：向 sb 后添加字符 c ；
     * 4.将列表 sb 转化为字符串并返回。
     * <p>
     * 复杂度分析：
     * 时间复杂度 O(N)O(N) ：遍历使用 O(N)，每轮添加（修改）字符操作使用 O(1)。
     * 空间复杂度 O(N)O(N) ：Java 新建的 StringBuilder 都使用了线性大小的额外空间。
     */
    class Solution {
        public String replaceSpace(String s) {
            StringBuilder sb = new StringBuilder(s);
            for (Character c : s.toCharArray()) {
                if (c == ' ') {
                    sb.append("%20");
                } else
                    sb.append(c);

            }
            return sb.toString();
        }
    }

}
