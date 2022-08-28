import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        // 记录编号
        String[] nums = br.readLine().split(" ");
        br.close();

        // 链表
        LinkedList<String> list = new LinkedList<String>();
        for (int i=0;i<n;i++){
            list.add(String.valueOf(i+1));
        }

        for (int i=0;i<m;i++){
            list.remove(list.indexOf(nums[i]));
            list.addFirst(nums[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
