package ZJTD;

import javax.xml.stream.Location;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-08-28-10:49
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        // 判断有几组数据
        while (t>0){
            int n = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().split(" ");

            long temp = 1;
            long max = 0;
            int start=0;
            int end=0;
            HashMap<Long, int[]> hashMap = new HashMap<>();
            hashMap.put(0L,new int[]{0,0});
            /**
             * 1
             * 5
             * 0 0 2 0 0
             * 错误输出1 1
             * 应该输出3 3
             */
            for (int i=0;i<n;i++){
                if(Integer.parseInt(nums[i]) != 0){
                    temp = temp * Integer.parseInt(nums[i]);
                    end = i;
                    if(i==n-1){
                        // 判断是否是最后一位
                        max = Math.max(max,temp);
                        temp=1;
                        int[] start_end = new int[2];
                        start_end[0]=start;
                        start_end[1]=end;
                        if(!hashMap.containsKey(max)){
                            hashMap.put(max,start_end);
                        }
                    }
                }else {
                    max = Math.max(max, temp);
                    temp = 1;
                    int[] start_end = new int[2];
                    start_end[0] = start;
                    start_end[1] = end;
                    if (!hashMap.containsKey(max)) {
                        hashMap.put(max, start_end);
                    }
                    start = i + 1;
                }
            }


            int[] locations = hashMap.get(max);
            System.out.print(locations[0]+1+" ");
            int last = locations[1];
            // 判断是否最后一位为1
            while (last != locations[0] && nums[last].equals("1")){
                last--;
            }
            System.out.print(last+1);
            System.out.println();

            t--;
        }
        br.close();
    }
}
