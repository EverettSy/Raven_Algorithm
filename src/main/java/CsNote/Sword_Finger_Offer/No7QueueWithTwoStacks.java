/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: No7QueueWithTwoStacks
 * Author:   YuSong
 * Date:     2018/11/25 0:50
 * Description: 剑指offer面试题7：用两个栈实现队列  * 题目：用两个栈实现一个队列。队列的声明如下：请实现他的两个函数appendTail和deleteHead，  * 分别完成在队列尾部插入节点和在队列头部删除节点的功能。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package main.CsNote.Sword_Finger_Offer;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈剑指offer面试题7：用两个栈实现队列
 * 题目：用两个栈实现一个队列。队列的声明如下：请实现他的两个函数appendTail和deleteHead，
 * 分别完成在队列尾部插入节点和在队列头部删除节点的功能。〉
 * <p>
 * 思路:所有元素进stack1，然后全部出stack1并进入stack2.实现队列的先进先出即：若stack2非空，我们需要的恰好再栈顶，出栈;若要给队列添加元素，即先进sack1,要出队时，若stack2不为空就出栈，为空时就把stack1全部进栈到stack2
 *
 * @author YuSong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class No7QueueWithTwoStacks {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    /**
     * 加入队列中的元素只加入到栈1中
     *
     * @param node
     */
    public static void push(int node) {
        stack1.push(node);
        System.out.println("压入栈元素：" + node);
    }

    public static int pop() {
        if (stack2.empty()) {
            System.out.println("弹出栈元素：" + stack2.pop());
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();

    }

    public static void main(String[] args) {
        //向空的队列中添加元素
        push(1);
        //向非空的队列中添加元素
        push(2);
        push(3);
        //向非空的队列中删除元素
        pop();
        pop();
        push(4);
        pop();
        push(5);
        pop();
        pop();
        pop();

    }
}

