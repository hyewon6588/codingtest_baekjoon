import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] num=new int[10];

        boolean found;
        ArrayList<Integer> mod=new ArrayList<>();
        String s;

        for(int i=0;i<num.length;i++){
            found=false;
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            num[i]=Integer.parseInt(st.nextToken());
            for(Integer n:mod){
                if((num[i]%42)==n){
                    found=true;
                    break;
                }
            }
            if(!found){
                mod.add(num[i]%42);
            }
        }
        System.out.println(mod.size());
    }
}