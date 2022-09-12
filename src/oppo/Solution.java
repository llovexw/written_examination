package oppo;

import java.util.*;



public class Solution {
    public static void main(String[] args) {
        new Solution().combineTwoDisorderNodeToOrder(new ListNode(3),new ListNode(2));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param node1 ListNode类
     * @param node2 ListNode类
     * @return ListNode类
     */
    public ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        List<Integer> list = new ArrayList<>();
        System.out.println(1);
        while(node1 != null){
            list.add(node1.val);
            node1 = node1.next;
        }
        while(node2 != null){
            list.add(node2.val);
            node2 = node2.next;
        }
        // 排序
        Collections.sort(list);
        System.out.println(list);

        ListNode listNode = new ListNode(list.get(0));
        ListNode temp = listNode;
        for (int i=0;i<list.size();i++){
            temp.val = list.get(i);
            System.out.println(list.get(i));
            if(i!=list.size()-1){
            temp.next = new ListNode(0);
            temp = temp.next;}
        }

        return listNode;
    }
}