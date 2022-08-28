package Leetcode;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-24-15:37
 */
public class Demo04 {
}

// 岛屿问题最大面积问题
class Solution04_1 {
    public int maxAreaOfIsland(int[][] grid) {
        int max_Area = 0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                int temp = dfs(grid,i,j);
                max_Area = Math.max(temp,max_Area);

            }
        }

        return max_Area;
    }

    public int dfs(int[][] grid,int i,int j){
        // grid[i][j] != 1重点是判断当前节点是否为1，如果不为1则立即返回0
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j] != 1){return 0;}
        grid[i][j]=0;

        int up      = dfs(grid,i-1,j);
        int right   = dfs(grid,i,j+1);
        int down    = dfs(grid,i+1,j);
        int left    = dfs(grid,i,j-1);

        return up + right + down + left +1;
    }
}


class Solution04_2 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int rows = grid.length, cols = grid[0].length;
        int res = 0;

        //逐行遍历数组中所有元素，是1(陆地)，则开始dfs(遍历其上下左右)
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){   //是陆地才进行dfs，水域直接跳过
                    dfs(grid, i, j); //传入gird和当前所处行列
                    //dfs返回说明已经找到一块岛屿的边界了(到数组边界or到水域)，res++
                    res++;
                }
            }
        }
        return res;
    }

    //寻找以(i,j)为中心的岛屿的边界,dfs目标是为了修改标记位为0，所以无需返回值
    private void dfs(char[][] grid, int i, int j){
        //递归终止条件:越界或者遇到水域
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';//把当前所在格子标记为水域(已访问过，避免重复访问)

        //递归其上下左右
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}