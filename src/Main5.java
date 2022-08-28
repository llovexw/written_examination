import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int nums = 1;
        long result = Long.MAX_VALUE;
        String str = br.readLine();
        br.close();

        int count_A = 0;
        int count_B = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)=='1'){
                count_B = count_B+i+1;
            }
        }

        while(nums<n+1){
            if(str.charAt(nums-1)=='0'){
                count_A = count_A + nums;
            }
            if (str.charAt(nums-1)=='1'){
                count_B = count_B -nums;
            }

            int abs = Math.abs(count_A-count_B);
            result = Math.min(result,abs);
            nums++;
        }

        System.out.println(result);

    }
}

