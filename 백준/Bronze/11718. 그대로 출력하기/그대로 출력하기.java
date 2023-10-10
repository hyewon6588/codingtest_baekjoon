import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while(true){
            s=br.readLine();
            if(s==null || s.isEmpty()){
                break;
            }
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}