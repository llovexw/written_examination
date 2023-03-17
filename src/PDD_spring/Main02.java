package PDD_spring;

import java.util.Scanner;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-12-20:28
 *
 * A攻击方式：攻击两名目标，每个目标扣 1 滴血
 * B攻击方式：攻击一名目标，每个目标扣所有血量
 *
 * 输入：
 * 3（行数） 3（个数）
 * 1 2 1
 * 2 3 2
 * 1 2 3
 *
 * 输出：
 * 2
 * 3
 * 3
 *
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();

        // 优先全部选择B攻击方式，若当前血量为1则选择攻击方式
        for (int i=0;i<T;i++){
            int A_count = 0;
            for(int j=0;j<N;j++){
                int tmp = sc.nextInt();
                if(tmp == 1){
                    A_count += 1;
                }
            }
            int ans = N - A_count/2 ;
            System.out.println(ans);
        }

    }
}
