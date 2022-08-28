package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        String[] str_lengths = br.readLine().split(" ");

        String o_str = br.readLine();
        String[] t_str = br.readLine().split(" ");

        br.close();

        /**
         * 匹配字符串
         * 6 2
         * aaaaaa
         * 4 2
         * aaaa
         * aa
         *
         * 输出 2
         */

        // 逐个进行匹配
        int count = 0;


        System.out.println(0);

    }
}

