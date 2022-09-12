package oppo;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-02-23:33
 */
import java.util.*;


public class Solution2 {
    public static void main(String[] args) {
        int[] n = new int[2];
        n[0]=3;
        n[1]=4;
        System.out.println(new Solution2().maxDigit(n));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param digits int整型一维数组
     * @return int整型
     */
    public int maxDigit (int[] digits) {
        // write code here
        int count = 0;
        int[] nums = new int[10];
        for(int i=0;i<digits.length;i++){
            nums[digits[i]] += 1;
        }
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        for(int i=9;i>=0;i--){
            for(int j=nums[i];j>0;j--){
                count = count*10 + i;
                nums[i]--;
            }
        }

        return count;
    }
}