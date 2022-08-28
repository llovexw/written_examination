package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);


        // 读取源字符串和目标字符串
        String s_str = br.readLine();
        String t_str = br.readLine();

        br.close();

        // 逐个进行匹配
        int count = 0;
        for (int i = 0;i<n;i++){
            int cur = i;
            for (int j=0;j<m;j++){
                // 匹配对应位是否匹配
                if(s_str.charAt(cur)==t_str.charAt(j) || t_str.charAt(j)=='*' ){
                    cur++;
                    if(j!=m-1){
                        continue;
                    }
                }else {
                    break;
                }
                // 全部匹配成功
                count++;
            }

            // 判断最后是否不够匹配
            if(n-i<m){
                break;
            }
        }

        System.out.println(count);

    }
}

