package utils;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-23-17:10
 */
public class TreeNode{
    int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

