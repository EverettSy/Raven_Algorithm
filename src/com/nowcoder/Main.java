/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Node
 * Author:   YuSong
 * Date:     2018/12/6 17:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nowcoder;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * https://www.nowcoder.com/questionTerminal/66b68750cf63406ca1db25d4ad6febbf
 * @author Raven
 * @create 2018/12/6
 * @since 1.0.0
 */
public class Main {
    public static HashMap<Integer, Node> hashMap = new HashMap<>();

    static class Node {
        private int position;
        private Node Next;

        public Node(int position) {
            this.position = position;
        }

        public void addNode(Node newNode) {
            if (this.Next == null) {
                this.Next = newNode;
            } else {
                this.Next.addNode(newNode);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n是总的人数 q是代表查询的组数，l是查询的左边界r是查询的右边界，k是查询的值，
        int n, q, l, r, k, num;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            num = in.nextInt();
            Node node = new Node(i);
            if (hashMap.get(num) != null) {//判断hashmap中是否存在该用户喜好，存在就添加到链尾
                hashMap.get(num).addNode(node);
            } else if (hashMap.get(num) == null) {//不存在就添加为头结点
                hashMap.put(num, node);
            }
        }

        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            l = in.nextInt();
            r = in.nextInt();
            k = in.nextInt();
            int count = 0;
            Node root = hashMap.get(k);// 获取洗好这个k的所有人的一个链表
            while (root != null && root.position <= r) {
                // 对链表进行循环，如果链表中的node中的值在l和r之间，则对count+1
                if (root.position >= l && root.position <= r) {
                    count++;
                }
                root = root.Next;
            }
            System.out.println(count);
        }


    }
}