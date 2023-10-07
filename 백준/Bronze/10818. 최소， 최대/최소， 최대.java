import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        long[] a;
        int n;
        long max,min;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        n=Integer.parseInt(st.nextToken());
        a=new long[n];
        s=br.readLine();
        st=new StringTokenizer(s," ");
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(st.nextToken());
        }
        max=a[0];
        min=a[0];
        for(long num:a){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }

        System.out.println(min+" "+max);
    }
}