package meituanSpring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-18-11:37
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] nums = new int[N][2];

        for (int i=0;i<N;i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }

        Arrays.sort(nums, (a,b)->a[1]-b[1]);
        int count = 0;
        int cost = 0;

        for (int i=0;i<N;i++){
            int originPrice = nums[i][0];
            int discountPrice = nums[i][1];

            if (cost >= X){
                break;
            }

            if(Y > 0 && originPrice > discountPrice){
                Y--;
                cost += discountPrice;
            }else {
                cost += originPrice;
            }


            count++;
        }
        System.out.println(count + " " + cost);

    }
}
