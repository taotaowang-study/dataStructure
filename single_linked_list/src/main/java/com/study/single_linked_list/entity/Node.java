package com.study.single_linked_list.entity;

/**
 * @ClassName: Node
 * @DESCRIPTION: 定义一个类作为节点
 * @author: 西门
 * @create: 2021-04-12 14:41
 **/
public class Node {

    //数据域
    public int data;

    //指针域，指向下一个节点
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
