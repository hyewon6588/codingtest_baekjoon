import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        long r=0;
        String b=st.nextToken();
        int n=Integer.parseInt(st.nextToken());

        for(int i=0;i<b.length();i++){
            r*=n;
            char a=b.charAt(i);
            int c=a;
            if(c>=48 && c<=57){
               r+=c-48;
            }else{
                r+=c-55;
            }
        }

        System.out.println(r);
    }
}
