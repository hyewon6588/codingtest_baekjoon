import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        char[] a;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        a=st.nextToken().toCharArray();

        System.out.println(Integer.valueOf(a[0]));

    }
}