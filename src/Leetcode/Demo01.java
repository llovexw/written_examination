package Leetcode;


import utils.TreeNode;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-21-22:22
 */
public class Demo01 {
    public static void main(String[] args) {

    }
}

// 中序遍历和后序遍历
class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;

        return recu(inorder,postorder,0,n-1 , 0, n-1);
    }

    public TreeNode recu(int[] inorder, int[] postorder, int inorder_left, int inorder_right, int postorder_left, int postorder_right){
        if(inorder_left > inorder_right || postorder_left > postorder_right){
            return null;
        }

        // 根节点在后序遍历的最后一个
        int val = postorder[postorder_right];
        TreeNode root = new TreeNode(val);

        // 查找根节点在中序遍历的位置
        int index = 0;
        for (int i = inorder_left;i<=inorder_right;i++){
            if(inorder[i]==val){
                index = i;
                break;
            }
        }

        int left_size = index - inorder_left;
        root.left = recu(inorder,postorder,
                inorder_left, index-1, postorder_left,postorder_left+left_size-1);
        root.right = recu(inorder,postorder,
                index+1,inorder_right,postorder_right-(inorder_right-index),postorder_right-1);

        return root;
    }
}
