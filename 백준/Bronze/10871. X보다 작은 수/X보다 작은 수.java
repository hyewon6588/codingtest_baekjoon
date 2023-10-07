import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a;
        int n,x;
//        int cnt=0;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        n=Integer.parseInt(st.nextToken());
        x=Integer.parseInt(st.nextToken());
        a=new int[n];
        s=br.readLine();
        st=new StringTokenizer(s," ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }

        for(int num:a){
            if(num<x){
                System.out.print(num+" ");
            }
        }
    }
}