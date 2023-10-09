import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n;
        int m=0;
        int[] score;
        double sum=0;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        n=Integer.parseInt(st.nextToken());
        score=new int[n];
        s=br.readLine();

        st=new StringTokenizer(s," ");
        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(st.nextToken());
            if(score[i]>m){
                m=score[i];
            }
        }
        for(int i=0;i<n;i++){
            sum+=((float)score[i]/m*100);
        }

        System.out.println(sum/n);

    }
}