import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int num=Integer.parseInt(st.nextToken());
        boolean group;
        int cnt=0;

        for(int i=0;i<num;i++){
            group=true;
            s=br.readLine();
            for(int j=0;j<s.length();j++){
                for(int k=j+1;k<s.length();k++){
                    if((s.charAt(j)==s.charAt(k)) && (k!=j+1)){
                        if(s.charAt(j)!=s.charAt(j+1)) {
                            group = false;
                            break;
                        }
                    }
                }
            }
            if(group){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
