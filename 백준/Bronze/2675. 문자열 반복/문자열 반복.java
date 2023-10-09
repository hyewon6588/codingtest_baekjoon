import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s,str;
        int t,r;
        char[] a;

        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        t=Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            str="";
            s=br.readLine();
            st=new StringTokenizer(s," ");
            r=Integer.parseInt(st.nextToken());
            a=st.nextToken().toCharArray();

            for(int j=0;j<a.length;j++){
                for(int k=0;k<r;k++){
                    str+=a[j];
                }
            }
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}