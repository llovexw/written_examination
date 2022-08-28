package Leetcode;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-24-14:17
 */
public class Demo03 {
}

class Solution02 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0)){return true;}
            }
        }
        return false;
    }

    // 同一个单元格内的字母不允许被重复使用。否则可能有造成循环的可能
    public boolean dfs(char[][] board, char[] words,int i,int j,int k){
        // 此处最关键的是考虑已经遍历过的数据，即board[i][j] != words ,我们主动将到达当前节点前的所有正确节点赋值为‘\0’, 使得此节点与对应值不相等
        if( i>=board.length || i<0 || j>=board[0].length || j<0 || board[i][j] != words[k] ){return false;}
        if (k == words.length-1){return true;}
        //  复制'\0'是为了避免出现重复字符, 此时能判断当前二维阵列节点的取值与words字符数组对应位置的字符相同
        board[i][j] = '\0';
        // 依次遍历检验上右下左
        boolean res = dfs(board,words,i-1,j,k+1) || dfs(board,words,i,j+1,k+1) ||
                      dfs(board,words,i+1,j,k+1) || dfs(board,words,i,j-1,k+1);
        // 重新恢复二维数组引用的字符数值
        board[i][j] = words[k];
        return res;
    }
}
