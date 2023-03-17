package PDD_spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-12-19:15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String o_str = br.readLine().trim();
        StringBuffer decode_str = new StringBuffer();
        int n = o_str.length();
        int left = 0;
        for(int right=left;right<n;right++){
            if (!(o_str.charAt(right) >= '0' && o_str.charAt(right) <= '9')){
                String tmp = o_str.substring(left,right+1);
                String tmp_char = String.valueOf(tmp.charAt(tmp.length()-1));
                int num = Integer.parseInt(tmp.substring(0,tmp.length()-1));

                for (int i=0;i<num;i++){
                    decode_str.append(tmp_char);
                }
                left=right+1;
            }
        }
        System.out.println(decode_str);
    }
}
