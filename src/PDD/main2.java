package PDD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-03-15:31
 */
public class main2 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T < 0){
            int n = Integer.parseInt(br.readLine());
            HashMap<Integer,String[]> hashMap = new HashMap<>();
            String[] str = br.readLine().split(" ");

            int[] dp = new int[n];
            // 从第1个位置开始需要走多少步
            for(int i=0;i<n;i++){
                int count = 0;

            }
        }
    }
}
