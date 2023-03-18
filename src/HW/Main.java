    package HW;
    
    
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    /**
     * @author luorui
     * @company SCUT
     * @create 2022-11-02-19:24
     */
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String origin_str = br.readLine();
            String[] str = origin_str.split(":");
            int[] temp = new int[8];
            int data = 0;
            int count = 1;
            if(str.length != 8){
                data = 8 - str.length;
            }
    
            for (int i=0;i<str.length;i++){
                if(!str[i].equals("") && str[i].length()!=4){
                    count *= 2;
                }
            }

            if(data>=1){
                count *= (int) Math.pow(2,data+1);
            }
    
            // 计算有多少连续的0
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0;i<str.length;i++){
                stringBuilder.append(temp[i]);
            }
            String[] test = new String(stringBuilder).split("0");
            for (int i=0;i<test.length;i++){
                if(test.length>1){
                    count++;
                }
            }
    
            if(data != 0){
                count++;
            }
    
            System.out.println(count);
    
        }
    }
