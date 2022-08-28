import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main7 {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weights = new int[n];

        // 重量数组
        String[] str = br.readLine().split(" ");
        for (int i=0;i<n;i++){
            weights[i] = Integer.parseInt(str[i]);
        }

        // 时间数组
        int[] times = new int[n];
        str = br.readLine().split(" ");
        for (int i=0;i<n;i++){
            times[i] = Integer.parseInt(str[i]);
        }
        int[] dp = new int[3];

        for (int i=0;i<n;i++){

            // 判断是否新增车辆到桥面
            if(weights[i]<=100-dp[0]){
                dp[0] += weights[i];

            }else if(weights[i]<=80-dp[1]){
                dp[1] += weights[i];

            }else if(weights[i]<=60-dp[2]){
                dp[2] += weights[i];

            }
        }

        for (int i : dp) {
            System.out.print(i+" ");
        }
    }
}

