package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-21-22:22
 */
public class Demo02 {
    public static void main(String[] args) {

    }
}

// 回文链表
class Solution01 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        System.out.println(list.get(1));
        for (Integer integer : list) {
            System.out.println(integer);
        }
        int count = 0;
        for(int i=0;i<n/2;i++){
            if(list.get(i) != list.get(n-1-i)){
                return false;
            }
        }
        return true;

    }
}
