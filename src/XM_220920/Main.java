package XM_220920;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //读取数据
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5000000];
        while (scan.hasNext()){
            int start = scan.nextInt();
            int end = scan.nextInt();
            for (int i=start;i<end;i++){
                nums[i] = 1;
            }
        }
        int count = 0;
        for (int num:nums){
            if(num == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}