package Leetcode;

import java.util.LinkedList;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-08-02-18:19
 */
public class Node{
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }


    // 添加数据 -----------------------------------
    Node head = null;
    public void add(int val){
        //每次插入一条数据就要新建一个扣子
        Node listNode = new Node(val);
        if (head == null){
            head = listNode;
            return;  //注意要返回
        }
        Node tempNode = head;
        //循环到链表的末尾
        while (tempNode.next !=null){
            tempNode = tempNode.next;
        }
        tempNode.next = listNode;
    }

    // 打印链表数据 --------------------------------
    public void nodePrint(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.val);
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    // 反转链表
//    public void reverse() {
//        Node cur = head.next;
//        Node next = null;
//        Node result=new Node(0);
//        while(cur!=null){
//            next = cur.next;
//            cur.next = result.next;
//            result.next = cur;
//            cur = next;
//        }
//        // 遍历结束，新头结点指向的为原链表的最后一个节点
//        head.next = result.next;
//    }

    // 反转链表
    public void reverse() {
        Node pre = null;
        Node cur = head;
        // 原当前节点为反转链表后的下一节点
        while(cur!=null){
            Node tempNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNode;
        }
        // head首节点指向翻转后的pre节点的头结点
        head = pre;
    }
}
