/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Solution
 * Author:   YuSong
 * Date:     2018/9/29 19:04
 * Description: 逆序打印单链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈逆序打印单链表〉
 *
 * @author Raven
 * @create 2018/9/29
 * @since 1.0.0
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailHead(ListNode listNode) {

        //public ArrayList<Integer> printListFromTailHead(ListNode listNode) {
       /* Stack<Integer> stack = new Stack<>();
        while (root != null) {
            //入栈
            stack.push(root.val);
            root = root.next;
            System.out.println(root);
        }*/
       /* ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            //出栈添加到链表中
            list.add(stack.pop());
        }*/
//        ArrayList<Integer> list = new ArrayList<>();
//        while (root !=null){
//        list.add(root.val);
//        root = root.next;
//    }
//        Collections.reverse(list);
//        return list;

       /* ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.addAll(printListFromTailHead(listNode.next));
            list.add(listNode.val);
        }
        return list;*/

        if (listNode != null) {
            this.printListFromTailHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(0);
        Solution s = new Solution();
        System.out.println(s.printListFromTailHead(listNode));
    }
}