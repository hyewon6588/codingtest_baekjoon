import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int a;
        int b;

        for (int i = 0; i < t; i++) {
            String s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            String str=Integer.toString(a+b);
            bw.write("Case #"+(i+1)+": "+str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}