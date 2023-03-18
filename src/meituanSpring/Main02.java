package meituanSpring;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-18-11:02
 */
public class Main02 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] nums = new int[N];

        for (int i=0;i<N;i++){
            nums[i]=sc.nextInt();
        }

        int maxResult = 0;
        for (int i=0;i<N;i++){
            int tmp = 0;
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for (int j=i;j<N;j++) {
                hashSet.add(nums[j]);
                if (hashSet.size() <= K) {
                    tmp++;
                }else{
                    break;
                }
            }
            maxResult = Math.max(tmp,maxResult);
        }

        System.out.println(maxResult);
    }
}
