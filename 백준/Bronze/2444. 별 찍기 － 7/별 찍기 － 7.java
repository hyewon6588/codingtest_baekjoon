import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt;

        cnt=Integer.parseInt(br.readLine());

        for(int i=1;i<=2*cnt-1;i++){
            if(i<=cnt) {
                for (int j = (cnt - i); j > 0; j--) {
                    bw.write(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    bw.write("*");
                }
            }else{
                for(int j=0;j<(i-cnt);j++){
                    bw.write(" ");
                }
                for(int j=((2*cnt-i)*2-1);j>0;j--){
                    bw.write("*");
                }
            }
            if(i<2*cnt-1){
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();

    }
}
