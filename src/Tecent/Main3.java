package Tecent;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-10-16-21:07
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> linkedList  = new LinkedList<>();
        int[] result = new int[n];
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            linkedList.add(in.nextInt());
        }
        for (int i=0;i<n;i++){
            if((i+1)%2 == 0){
                if(linkedList.getFirst() > linkedList.getLast()){
                    result[i] = linkedList.removeFirst();
                }else {
                    result[i] = linkedList.removeLast();
                }
            }else {
                if(linkedList.getFirst() < linkedList.getLast()){
                    result[i] = linkedList.removeFirst();
                }else {
                    result[i] = linkedList.removeLast();
                }
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}