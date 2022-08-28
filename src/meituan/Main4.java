package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        String[] p = br.readLine().split(" ");

        String[] t = br.readLine().split(" ");

        br.close();

        /**
         * 机器人
         * 3 5
         * 1 2 3
         * 7 5 4
         *
         * 输出10
         */
        // 先判断是否能启动第一个机器人

        if(Integer.parseInt(p[0]) > b) {
            System.out.println(-1);
            return;
        }

        int left_b = 0;
        int count = 0;
        for (int i=0;i<n;i++){
            left_b = b - Integer.parseInt(p[i]);
            count += Integer.parseInt(t[0]);
        }

        System.out.println(count);
    }
}

