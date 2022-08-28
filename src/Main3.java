import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) throws IOException {

        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }
        int str_length = str[0].length();
        br.close();

        int[] nums = new int[str_length];

        for(int i=0;i<str_length;i++){
            StringBuilder string = new StringBuilder();
            for(int j=0;j<n;j++){
                string.append(str[j].charAt(i));
            }
            int temp = Integer.parseInt(String.valueOf(string));
            nums[i]=temp;
        }

        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print(num+" ");
        }

    }
}

