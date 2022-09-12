package DD;

import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-04-19:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long k = scan.nextInt();

        long countWeight = 0;
        long countNum = 0;
        long max_weigt = 0;
        for (int i=0;i<n;i++){
            long temp = scan.nextInt();
            countWeight += temp;
            countNum++;
            if(countWeight/countNum <= k){
                max_weigt = Math.max(max_weigt,temp);
            }else {
                countWeight -= max_weigt;
                countNum--;
            }
        }

        System.out.println(countNum);
    }
}
