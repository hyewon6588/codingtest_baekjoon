import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] basket;
        int n,m;
        int i,j,temp;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        basket=new int[n];
        for(int index=0;index<n;index++){
            basket[index]=index+1;
        }

        for(int l=0;l<m;l++){
            s=br.readLine();
            st=new StringTokenizer(s," ");
            i=Integer.parseInt(st.nextToken())-1;
            j=Integer.parseInt(st.nextToken())-1;
            temp=basket[i];
            basket[i]=basket[j];
            basket[j]=temp;
        }

        for(int l=0;l<n;l++){
            System.out.print(basket[l]+" ");
        }
    }
}