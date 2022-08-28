import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //队列先进先出，尾部插入，头部弹出
        Queue<TreeNode> temp = new ArrayDeque<>();

        if(root != null){
            temp.add(root);
        }
        while(!temp.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int n = temp.size();
            for(int i=0;i<n;i++){
                //这一步是关键，获取弹出来的节点，然后检查其左右子树
                TreeNode node = temp.poll();
                list.add(node.val);
                if(node.left != null){
                    temp.add(node.left);
                }
                if(node.right != null){
                    temp.add(node.right);
                }
            }
            res.add(list);
        }

        return res;
    }
}

public class Main2 {

    public static void main(String[] args) throws IOException {

        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_o =br.readLine();
        String[] situation = br.readLine().split("/");
        String str_add =br.readLine();
        br.close();

        TreeNode root = treenode(str_o);
        TreeNode node_add = treenode(str_add);


        List<List<Integer>> ret = new Solution().levelOrder(root);
        List<List<Integer>> ret_add = new Solution().levelOrder(node_add);

        String out = int2dListToString(ret);

        System.out.println(out);

        System.out.println(situation[1]);
        System.out.println(situation[2]);

        /**
         * 测试用例
            [1,2,3,4]
            /1/2
            [4,5,6]

         实际应该输出[1,2,4,5,6]
        */

    }

    // 将List<List<Integer>> 转换为带[]的数组,用于输出操作
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static TreeNode treenode(String str_o){
        str_o = str_o.trim();
        str_o = str_o.substring(1,str_o.length()-1);

        if(str_o.length()==0){
            return null;
        }

        String[] str = str_o.split(",");
        String temp = str[0];
        TreeNode root = new TreeNode(Integer.parseInt(temp));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int n = str.length;

        int count = 1;
        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();

            if (count==n){break;}
            // 先用再加
            temp = str[count++];

            if(!temp.equals("0")){
                int leftNum = Integer.parseInt(temp);
                node.left = new TreeNode(leftNum);
                nodeQueue.add(node.left);
            }

            if(count == str.length){break;}
            temp = str[count++];
            if(!temp.equals("0")){
                int rightNum = Integer.parseInt(temp);
                node.right = new TreeNode(rightNum);
                nodeQueue.add(node.right);
            }
        }

        return root;
    }

}

