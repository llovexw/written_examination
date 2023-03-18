package meituanSpring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author luorui
 * @company SCUT
 * @create 2023-03-18-10:40
 */
public class Main03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n=str.length();
        char[] chars = str.toCharArray();
        for (int i=0;i<n/2;i++){
            int j=n-i-1;
            if(chars[i] != chars[j]){
                char oldI = chars[i];
                char oldJ = chars[j];
                chars[i] = (char) Math.min(oldI,oldJ);
                chars[j] = (char) Math.min(oldI,oldJ);
                if(isValid(chars)){
                    System.out.println(new String(chars));
                }
                chars[i] = oldI;
                chars[j] = oldJ;
            }
        }

    }

    public static boolean isValid(char[] chars){
        int n= chars.length;
        for (int i=0;i<n/2;i++){
            if(chars[i] != chars[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
