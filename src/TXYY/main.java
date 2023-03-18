package TXYY;

import DD.Main;

import java.util.ArrayList;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-26-19:39
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(500);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(50);
        arrayList.add(4);
        int subarrayNum = new main().getSubarrayNum(arrayList, 2);

        int a = 100;
        Integer b = 123456;
        Integer c = new Integer(100);
        System.out.println(a==b);
        System.out.println(c==b);

        System.out.println(subarrayNum);
    }

    public int getSubarrayNum (ArrayList<Integer> a, int x) {
        // write code here
        int count = 0;
        for (int i=0;i<a.size();i++){
            long temp = a.get(i);
            if((temp % Math.pow(10,x)) == 0){
                count = count + a.size() - i;
                continue;
            }
            for (int j=i+1;j< a.size();j++){
                temp = temp * a.get(j);
                if((temp % Math.pow(10,x)) == 0){
                    count = count + a.size() - j;
                    break;
                }
            }
        }
        return count % 1000000007;
    }
}
