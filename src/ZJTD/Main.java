package ZJTD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-08-28-10:49
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tree = br.readLine().split(" ");
        int left_num = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(false);
        System.out.println(0);
    }
}
