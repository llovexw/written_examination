package JD;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-03-19:54
 */
import Thinking_in_Java.A.Test;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        //读取数据
        int n = in.nextInt();
        int max_num = 0;
        int count_temp = 0;
        int real_nums = 0;
        for(int i=0;i<n;i++){
            int temp = in.nextInt();
            if(temp > max_num){
                max_num = temp;
                count_temp += real_nums;
                real_nums = 1;
            }else if(temp == max_num){
                real_nums++;
            }else {
                count_temp++;
            }
        }
        System.out.println(count_temp);
    }
}