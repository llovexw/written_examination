package BaiDu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-07-20:02
 */

/**
 * 第一行数组个数，a表示需要排队，p表示开始处理，第一个数字为编号，第二个数字为优先级
 * 4
 * a 1 3
 * a 2 2
 * a 3 2
 * p
 *
 *-------------------------------------
 *
 * 5
 * a 1 3
 * a 2 2
 * a 3 2
 * p
 * p
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        int count = n;
        int[] array = new int[n];
        Arrays.fill(array,1000);

        int[][] tmp = new int[n+1][n+1];

        while(n > 0){
            String[] str = br.readLine().split(" ");
            String state = str[0];
            if(state.equals("a")) {
                int num = Integer.parseInt(str[1]);
                int x = Integer.parseInt(str[2]);
                tmp[x][0] = tmp[x][0] + 1;
                tmp[x][num] = num;
                array[count-n] = x;
            }else{
                Arrays.sort(array);
                if(array[0] != 1000){
                    for (int i=1;i<count+1;i++){
                        if(tmp[array[0]][i] != 0){
                            System.out.println(tmp[array[0]][i]);
                            tmp[array[0]][i] = 0;
                            array[0] = 1000;
                            break;
                        }
                    }
                }
            }
            n--;
        }

    }
}

