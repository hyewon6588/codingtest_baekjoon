import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        String str=st.nextToken();

        System.out.println(str.length());
    }
}