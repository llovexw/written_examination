package BaiDu;

import java.util.HashMap;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-07-20:14
 */
public class Main02 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,2);
        hashMap.put(1,1);
        hashMap.put(1,3);
        System.out.println(hashMap.get(1));
    }
}
