package Tecent;
import java.util.*;
/**
@author luorui
@company SCUT
@create 2022-10-16-19:44
*/public class Main {
    public static void main(String[] args) {
        new Solution().xorList(new StringBuilder("1011"), new StringBuilder("01"));
    }
}




class ListNode {
  int val;
  ListNode next = null;
  public ListNode(int val) {
    this.val = val;
  }
}


class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param a ListNode类
     * @param b ListNode类
     * @return ListNode类
     */
    public ListNode xorList (StringBuilder str1, StringBuilder str2) {

        StringBuilder result = new StringBuilder();
        str1.reverse();
        int m = str1.length();
        int n = str2.length();
        if(m > n){
            for(int i=0;i<n;i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    result.append("0");
                }else{
                    result.append("1");
                }
            }
            result.append(str1.substring(n,m));
        }else{
            for(int i=0;i<m;i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    result.append("0");
                }else{
                    result.append("1");
                }
            }
            result.append(str1.substring(m,n));
        }

        result = result.reverse();
        ListNode listNode = new ListNode(0);
        ListNode resultNode = listNode;
        for(int i=0;i<result.length();i++){
            listNode.next = new ListNode(Integer.parseInt(String.valueOf(result.charAt(i))));
            listNode = listNode.next;
        }

        return resultNode.next;
    }
}
