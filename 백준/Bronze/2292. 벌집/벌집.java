import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Integer.parseInt(br.readLine());
        int cnt=1;
        while(n>0){
            if(n>1) {
                n+=cnt;
                n -= 7 * cnt;
                cnt++;
            }else{
                n-=7*cnt;
            }

        }
        System.out.println(cnt);

    }
}
