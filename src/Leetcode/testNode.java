package Leetcode;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-08-02-18:23
 */
public class testNode {


    public static void main(String[] args) {
        Node node = new Node();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);

        // 打印测试
        node.nodePrint();

        // 反转链表测试
        node.reverse();
        node.nodePrint();
    }
}
