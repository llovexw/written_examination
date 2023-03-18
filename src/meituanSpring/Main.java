package meituanSpring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-18-9:48
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] allEnmies = new int[N][2];

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            allEnmies[i][0] = x;
            allEnmies[i][1] = y;
        }

        int n = allEnmies.length;

        int result = 1;
        for(int i=0;i<n;i++){
            int tmp = 1;
            int x = allEnmies[i][0];
            int y = allEnmies[i][1];
            for (int j =0;j<n;j++){
                if((Math.abs(x - allEnmies[j][0]) <= A) && (Math.abs(y - allEnmies[j][1]) <= B)){
                    tmp++;
                }
            }
            result = Math.max(result,--tmp);
        }

        System.out.println(result);


//        Arrays.sort(allEnmies,(a,b) -> a[1] - b[1]);
//
//        int count = 0;
//        int left = 0;
//        int right = 0;
//        while (right < allEnmies.length){
//            while (left < right && (allEnmies[right][1] - allEnmies[left][1] > B)){
//                left++;
//            }
//
//            int tmp = 0;
//            for (int i=left;i<=right;i++){
//                if(Math.abs(allEnmies[i][0] - allEnmies[right][0]) <= A){
//                    tmp++;
//                }
//            }
//
//            count = Math.max(count,tmp);
//            right++;
//        }
//        System.out.println(count);

//        int count=0;
//        for(int i=0;i<N;i++){
//            int tmp = 0;
//            for (int j=0;j<N;j++){
//
//            }
//        }

    }
}
