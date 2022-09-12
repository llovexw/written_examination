package JD;

import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-03-20:12
 */

/**
 * 1 0
 * 2 1
 * 3 2
 * 4 3
 * 5 4
 * 6 4
 * 7 5
 * 8 5
 * 9 5
 * 10 6
 * 11 7
 * 12
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读取数据
        int n = in.nextInt();
        int[] dp = new int[100001];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 4;
        dp[6] = 4;
        for (int i=7;i<100001;i++){
            for (int j=1;j<=Math.sqrt(i);j++){
                if(j==1){dp[i] = dp[i-1] + 1;}
                if(i%j == 0){
                    dp[i] = Math.min(dp[i],dp[i/j] + dp[j] + 1);
                }
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            int temp = in.nextInt();
            if(dp[temp] != 0){
                count += dp[temp];
            }
        }
        System.out.println(count);
    }
}