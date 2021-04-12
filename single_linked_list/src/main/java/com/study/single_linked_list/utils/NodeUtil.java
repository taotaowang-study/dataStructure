package com.study.single_linked_list.utils;

import com.study.single_linked_list.entity.Node;

/**
 * @ClassName: NodeUtil
 * @DESCRIPTION:
 * @author: 西门
 * @create: 2021-04-12 14:45
 **/
public class NodeUtil {
    private static Node head = null;
    //static {
    //    head = new Node(0);
    //}

    /**
     * 向链表添加数据
     *
     * @param value 要添加的数据
     */
    public static void addData(int value) {

        //初始化要加入的节点
        Node newNode = new Node(value);

        //临时节点
        Node temp = head;

        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }

        // 已经包括了头节点.next为null的情况了～
        temp.next = newNode;
    }

    /**
     * 遍历链表
     *
     * @param head 头节点
     */
    public static void traverse(Node head) {


        //临时节点，从首节点开始
        Node temp = head.next;

        while (temp != null) {

            System.out.println("关注公众号Java3y：" + temp.data);

            //继续下一个
            temp = temp.next;
        }
    }

}
