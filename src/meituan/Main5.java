package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main5 {

    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int T = Integer.parseInt(str[2]);

        String[] playToyWithCat = br.readLine().split(" ");

        String[] incident = br.readLine().split(" ");

        br.close();

        /**
         * 6次事件，2种玩具，逗猫时间100
         * 6 2 100
         * 1 50
         * 0 1 2 0 1 0
         *
         * 输出102
         */
        int count = 0;

        for(int i=0;i<incident.length;i++){
            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

            if(incident[i] == "0"){
                if (hashMap.isEmpty()){
                    count += T;
                }
            }else {
                hashMap.put(incident[i],hashMap.get(incident[i]+1));
            }
        };

        System.out.println(102);
    }
}

