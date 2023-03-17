package PDD_spring;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-12-19:46
 *
 *
 * ----------------------
 * 5
 * 1 2 3 4 10
 *
 *
 * 答案:
 * 1 2 2 3 4
 * 1 2 2 3 3
 */
public class Main04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] tmp_nums = new int[n];


        // 平均数
        double total = 0;
        int[] aver = new int[n];

        int[] middle_list = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            total += nums[i];
            double average = total/(i+1);
            aver[i] = (int) Math.round(average);

            if(i==0){
                middle_list[i] = nums[i];
                tmp_nums[i] = nums[i];
                continue;
            }
            int[] temp = Arrays.copyOf(tmp_nums,i+1);
            Arrays.sort(temp);

            if((i+1)/2 != 0){
                middle_list[i] = temp[(i+1)/2];
            }else {
                int middle = (i+1)/2;
                double tmp = (temp[middle] + temp[middle+1]) / 2;
                middle_list[i] = (int) Math.round(tmp);
            }
        }

        for (int i : aver) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : middle_list) {
            System.out.print(i + " ");
        }
    }
}
