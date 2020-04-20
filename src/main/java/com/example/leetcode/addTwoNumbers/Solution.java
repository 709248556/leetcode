package com.example.leetcode.addTwoNumbers;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers2(l1,l2,0);
    }

    private ListNode addTwoNumbers2(ListNode l1, ListNode l2, int z) {
        if(l1==null&&l2==null&&z==0){
            return null;
        }
        if(l1==null){
            l1=new ListNode(0);
        }
        if(l2==null){
            l2=new ListNode(0);
        }
        int temp = l1.val + l2.val + z;
        ListNode listNode = new ListNode(temp%10);
        listNode.next =  addTwoNumbers2(l1.next,l2.next,temp/10);
        return listNode;
    }
}
