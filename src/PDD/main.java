package PDD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-03-15:03
 */
public class main {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String[] data = br.readLine().split(" ");
            int n = Integer.parseInt(data[0]);
            int k = Integer.parseInt(data[1]);

            String oStr = br.readLine();
            int[] nums = new int[26];
            Map<Integer,Character> hashMap = new HashMap<>();

        }

    }
}
