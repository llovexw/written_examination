package BD_220913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-09-13-19:40
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');

        int count = 0;
        // 检查字符串
        for(int i = 0 ;i < n; i++){
            if(n-i<5){
                break;
            }
            HashSet<Character> tempSet = new HashSet<>();
            for(int j=0;j<5;j++){
                boolean flag = false;
                switch (j){
                    case 0 : {
                        if(!hashSet.contains(str.charAt(i+j))){
                        flag = tempSet.add(str.charAt(i+j));
                    }
                        break;
                    }
                    case 1 : {
                        if(hashSet.contains(str.charAt(i+j))){
                            flag = tempSet.add(str.charAt(i+j));
                        }
                        break;
                    }
                    case 2 : {
                        if(hashSet.contains(str.charAt(i+j))){
                            flag = tempSet.add(str.charAt(i+j));
                        }
                        break;
                    }
                    case 3 : {
                        if(!hashSet.contains(str.charAt(i+j))){
                            flag = tempSet.add(str.charAt(i+j));
                        }
                        break;
                    }
                    case 4 : {
                        if(hashSet.contains(str.charAt(i+j))){
                            flag = tempSet.add(str.charAt(i+j));
                        }
                        break;
                    }
                }

                if(flag){
                    if(j==4){count++;}
                }else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
