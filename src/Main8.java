import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {
    public static StringBuilder route =new StringBuilder();
    public static int min = 0;

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str= br.readLine().split(" ");
        int temp = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int[][] dp = new int[m][n];
        int origin_x = Integer.parseInt(str[2]);
        int origin_y = Integer.parseInt(str[3]);
        for(int i=0;i<m;i++){
            str = br.readLine().split(" ");
            for (int j=0;j<n;j++){
                dp[i][j] = Integer.parseInt(str[j]);
            }
        }
        route.append(origin_x);
        route.append(origin_y);

        dfs(dp,origin_x-1,origin_y-1);

    }

    public static void dfs(int[][] dp,int x,int y){
        if(x<0 || y<0 || x>dp.length || y>dp[0].length || dp[x][y]==4){
            route.deleteCharAt(route.length()-1);
            route.deleteCharAt(route.length()-1);
            return;
        }
        if(dp[x][y]==1){
            route.append(x);
            route.append(y);
            for(int i=0;i<route.length();i++){
                int temp = route.charAt(i)-'0';
                System.out.print( temp + " ");
            }
        }

        if(dp[x][y]==2||dp[x][y]==3){
            route.deleteCharAt(route.length()-1);
            route.deleteCharAt(route.length()-1);
            return;
        }

        dp[x][y]=4;

        route.append(x);
        route.append(y);

        dfs(dp,x+1,y);
        dfs(dp,x,y+1);
        dfs(dp,x-1,y);
        dfs(dp,x,y-1);
    }
}

