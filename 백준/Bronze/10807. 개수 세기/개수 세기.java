import javax.xml.stream.events.EndDocument;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums;
        int n,v;
        int cnt=0;

        String s;
        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        n=Integer.parseInt(st.nextToken());
        nums=new int[n];
        s=br.readLine();
        st=new StringTokenizer(s," ");
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }
        s=br.readLine();
        st=new StringTokenizer(s);
        v=Integer.parseInt(st.nextToken());

        for(int num:nums){
            if(num==v){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}