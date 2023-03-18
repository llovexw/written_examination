package BD_220913;

import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-13-20:15
 */
public class Main02 {
    // 砍怪
    // 1mp -1
    // 5mp -1 -2 -3
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] hps = new long[n];
        long mp = 0;
        for(int i=0;i<n;i++){
            hps[i] = scan.nextLong();
        }

        for (int i=n-1;i>=0;i--){
            if(i < 2){
                mp += hps[i];
                hps[i] = 0;
                continue;
            }
            while (hps[i]>0){
                if(hps[i-2] >= 1 && hps[i-1]>=2 && hps[i]>=3){
                    mp += 5;
                    hps[i] -= 3;
                    hps[i-1] -= 2;
                    hps[i-2] -= 1;
                }else {
                    // 此处循环时间过大。。。
                    /**
                     * 应该修改为
                     * mp += hps[i];
                     * hps[i] = 0;
                     */
                    mp += 1;
                    hps[i] -= 1;
                }
            }
        }

        System.out.println(mp);
    }
}
