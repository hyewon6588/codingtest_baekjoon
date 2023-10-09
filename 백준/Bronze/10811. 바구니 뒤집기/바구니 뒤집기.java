import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n,m,i,j;
        int[] basket;
        int temp;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        basket=new int[n];

        for(int a=0;a<n;a++){
            basket[a]=a+1;
        }

        for(int a=0;a<m;a++){
            s=br.readLine();
            st=new StringTokenizer(s," ");
            i=Integer.parseInt(st.nextToken())-1;
            j=Integer.parseInt(st.nextToken())-1;

            while(i<j){
                temp=basket[i];
                basket[i]=basket[j];
                basket[j]=temp;
                i++;
                j--;
            }
        }

        for(int a=0;a<basket.length;a++){
            System.out.print(basket[a]+" ");
        }
    }
}