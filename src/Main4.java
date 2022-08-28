import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) throws IOException {

        int[] a = new int[]{1,2,3,4};
        System.out.println(new Main4().getNumber(a));

    }
    public int getNumber (int[] a) {
        int result = 0;
        // write code here
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);

        List<Integer> arrayList = new ArrayList<>();
        int temp_num = 0;

        for(int i=2;i<=a.length;i++){
            boolean temp = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp = false;
                    hashSet.add(i);
                    break;
                }
            }
            if(temp){
                arrayList.add(a[i-1]);
                temp_num++;
            }
        }

        while (arrayList.size()!=1){
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<arrayList.size();i++){
                if(hashSet.add(i+1)){
                    tempList.add(arrayList.get(i));
                }
            }
            arrayList = tempList;
        }

        System.out.println(arrayList.get(0));

        return arrayList.get(0);
    }
}

