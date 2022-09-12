package DD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-04-20:13
 */

/**
 *
 * 2
 * 0 1
 * 0 10
 * 0 1
 *
 * 1233美丽数为3
 * 1^2^3^3 = 3
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] start = br.readLine().split(" ");
        String[] end = br.readLine().split(" ");
        String[] target = br.readLine().split(" ");
        br.close();
        int[] dp = new int[700001];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2;i<700001;i++){
            String tempStr = String.valueOf(i);
            int result = tempStr.charAt(0) - 48;
            if(i<10){
                dp[i] = result;
                continue;
            }
            for (int j=1;j<tempStr.length();j++){
                result = result ^ (tempStr.charAt(j) - 48);
            }
            dp[i] = result;
        }

        // 开始判断第一个字符串
        for (int i=0;i<T;i++){
            int count = 0;
            for (int j=Integer.parseInt(start[i]);j <= Integer.parseInt(end[i]); j++){
                if(dp[j] == Integer.parseInt(target[i])){
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
