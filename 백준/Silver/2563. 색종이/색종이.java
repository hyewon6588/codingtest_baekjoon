import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int c=Integer.parseInt(br.readLine());
        int[][] sq=new int[100][100];
        int cnt=0;
        for(int i=0;i<c;i++){
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    sq[j][k]++;
                }
            }
        }

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(sq[i][j]>=2){
                    cnt+=sq[i][j]-1;
                }
            }
        }

        int area=c*100-cnt;
        System.out.println(area);
    }
}
