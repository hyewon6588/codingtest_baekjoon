import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i;
        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        String str=st.nextToken();
        s=br.readLine();
        st=new StringTokenizer(s);
        i=Integer.parseInt(st.nextToken());
        System.out.println(str.charAt(i-1));
    }
}