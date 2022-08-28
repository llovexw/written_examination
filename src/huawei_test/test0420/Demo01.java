package huawei_test.test0420;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-24-16:22
 * 做题，10道判断 10*2，10道单选 10*4，5道多选 5*8，总共100分。按顺序做，错三个结束。
 * 给定分数，问有多少种可能的情况
 */
import java.util.Scanner;

public class Demo01 {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        dfs(score,1,0);
        System.out.println(ans);
    }

    static void dfs(int target,int i,int wrong){
        if(target == 0){
            ans++;
            return;
        }
        if(i>25 || wrong >= 3){
            return;
        }
        if(i<=10){
            dfs(target-2,i+1,wrong);
            dfs(target,i+1,wrong+1);
        }else if(i<=20){
            dfs(target-4,i+1,wrong);
            dfs(target,i+1,wrong+1);
        }else if(i<=25){
            dfs(target-8,i+1,wrong);
            dfs(target,i+1,wrong+1);
        }
    }
}
