import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n,sum=0;
        char[] a;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        n=Integer.parseInt(st.nextToken());
        s=br.readLine();
        st=new StringTokenizer(s);
        a=st.nextToken().toCharArray();
        for(int i=0;i<n;i++){
            sum+= (int) a[i] -48;
        }
        System.out.println(sum);

    }
}