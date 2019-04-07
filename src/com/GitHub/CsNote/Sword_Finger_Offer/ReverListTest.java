/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ReverListTest
 * Author:   YuSong
 * Date:     2018/11/12 23:11
 * Description: 链表反转以及测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Sword_Finger_Offer;


/**
 * 〈一句话功能简述〉<br>
 * 〈链表反转以及测试〉
 *
 * @author Raven
 * @create 2018/11/12
 * @since 1.0.0
 */
public class ReverListTest {

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        //打印反转前的链表
        Node node = head;
        while (null != node) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }

        //调用反转方法
        head = Reversel(head);

        System.out.println("\n**************************");

        //打印反转后的结果
        while (null != head){
            System.out.print(head.getData()+" ");
            head = head.getNext();
        }

    }

    /**
     * 递归，在反转当前节点之前先反转后续节点
     *
     * @param head
     * @return
     */
    public static Node Reversel(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;
        }
        // 先反转后续节点head.getNext()
        Node reHead = Reversel(head.getNext());
        // 将当前结点的指针域指向前一结点
        head.getNext().setNext(head);
        // 前一结点的指针域令为null;
        head.setNext(null);
        //反转后新链表的头结点
        return reHead;
    }
}

class Node {
    /**
     * 数据域
     */
    private int Data;
    /**
     * 指针域
     */
    private Node Next;

    public Node(int Data) {
        // super();
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }
}
