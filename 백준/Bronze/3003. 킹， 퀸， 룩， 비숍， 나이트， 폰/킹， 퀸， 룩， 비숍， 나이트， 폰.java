import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        int[] need={1,1,2,2,2,8};

        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        for(int i=0;i<need.length;i++){
            need[i]-=Integer.parseInt(st.nextToken());
            bw.write(need[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}