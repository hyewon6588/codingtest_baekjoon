import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t;
        String s,str;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        t=Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            s=br.readLine();
            st=new StringTokenizer(s);
            str=st.nextToken();
            bw.write(str.substring(0,1)+str.substring(str.length()-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}