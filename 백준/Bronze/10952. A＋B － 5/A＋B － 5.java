import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int a=1;
        int b=1;
        String s;
        while(a!=0 || b!=0){
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            String str=Integer.toString(a+b);
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}