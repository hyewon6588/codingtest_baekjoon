import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int max=0;
        int[][] a=new int[9][9];
        int r=0,c=0;

        for(int i=0;i<9;i++){
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            for(int j=0;j<9;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
                if(a[i][j]>max){
                    r=i;
                    c=j;
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println((r+1)+" "+(c+1));
    }
}
