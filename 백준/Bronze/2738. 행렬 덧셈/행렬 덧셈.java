import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        int n,m;

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        int[][] sum=new int[n][m];

        for(int i=0;i<n;i++){
            s=br.readLine();
            st=new StringTokenizer(s," ");
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            s=br.readLine();
            st=new StringTokenizer(s," ");
            for(int j=0;j<m;j++){
                b[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
