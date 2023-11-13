import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        long a=Integer.parseInt(st.nextToken());
        long b=Integer.parseInt(st.nextToken());
        long v=Integer.parseInt(st.nextToken());
        long cnt=1;
        double p=(v-a)/(a-b);
        double p2=(v-a)%(a-b);

        if (a != v) {
            if(p>0) {
                if(p2>=1){
                    cnt+=p+1;
                }else {
                    cnt += p;
                }
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
