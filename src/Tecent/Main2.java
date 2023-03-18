package Tecent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-10-16-21:13
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] nums = new long[n];
        int temp = 0;
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            nums[temp] = in.nextInt();
            temp++;
        }
        Arrays.sort(nums);
        for (int i=0;i<k;i++){
            long change = countOne(nums[n-1]);
            nums[n-1] = change;
            Arrays.sort(nums);
        }

        long result = 0;
        for (int i=0;i<n;i++){
            result += nums[i];
        }

        System.out.println(result);
    }


    // 计算1的个数
    public static long countOne(long n){
        int count = 0;
        while (n != 0){
            n = n & (n-1);
            count++;
        }

        return count;
    }
}
