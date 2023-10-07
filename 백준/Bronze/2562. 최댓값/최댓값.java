import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a=new int[9];
        int index=0;
        int max;

        String s;
        for(int i=0;i<a.length;i++){
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            a[i]=Integer.parseInt(st.nextToken());
        }
        max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                index=i;
            }
        }

        System.out.println(max+"\n"+(index+1));
    }
}