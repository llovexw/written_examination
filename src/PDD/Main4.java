package PDD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-03-15:47
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);
        int r = Integer.parseInt(str[2]);

        // 班级人数和班级数量是否可以除断
        float count = 0;
        float my_score = 0;
        if(n%c == 0){
            int group = (r-1)/c;
            for (int i=0;i<n;i++){
                str = br.readLine().split(" ");
                float temp = Float.parseFloat(str[1]);
                if(i==r-1){my_score = temp;}
                if(i/c != group){
                    count += temp;
                }
            }
            float result = count/c;
            result += my_score;
            result = result/(n/c);
            System.out.println(String.format("%.2f",result));
        }else {
            int group = (r-1)/c;
            for (int i=0;i<n;i++){
                str = br.readLine().split(" ");
                float temp = Integer.parseInt(str[1]);
                if(i==r-1){my_score = temp;}
                if(i/c != group){
                    count += temp;
                }
            }
            float result = count/c;
            result += my_score;
            result = (float) (result/(n/c+0.5));
            System.out.println(String.format("%.2f",result));
        }
    }
}
