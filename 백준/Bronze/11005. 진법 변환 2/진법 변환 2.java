import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        long n=Long.parseLong(st.nextToken());

        int b=Integer.parseInt(st.nextToken());
        String r="",f="";
        int d=0;

        while(n!=0){
            char c;
            d= (int) (n%b);
            if(d<10){
                    c= (char) (d+48);
            }else{
                    c=(char) (d+55);
            }
            
            r+=c;
            n/=b;
        }
        for(int i=r.length()-1;i>=0;i--){
            f+=r.charAt(i);
        }

        System.out.println(f);
    }
}
