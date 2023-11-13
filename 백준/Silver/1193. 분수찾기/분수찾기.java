import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long x=Integer.parseInt(br.readLine());
        int a=1,b=1;
        while(x>1){
            x--;
            if(a>1 || b>1) {
                if ((a + b) % 2 == 0) {
                    if (a > 1) {
                        a--;
                    }
                    b++;
                } else {
                    a++;
                    if (b > 1) {
                        b--;
                    }
                }
            }else{
                if ((a + b) % 2 == 0) {
                    b++;
                }else{
                    a++;
                }
            }
        }
        System.out.println(a+"/"+b);
    }
}
