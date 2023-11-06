import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int q,d,n,p;

        for(int i=0;i<t;i++){
            int c=Integer.parseInt(br.readLine());
            q=c/25;
            c-=(q*25);
            d=c/10;
            c-=(d*10);
            n=c/5;
            c-=(n*5);
            p=c;
            bw.write(q+" "+d+" "+n+" "+p);
            bw.newLine();
        }
        bw.flush();

    }
}
