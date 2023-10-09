import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,str="";
        int temp;
        char[] a;
        char[] alphabet={'a','b','c','d','e','f','g','h',
                     'i','j','k','l','m','n','o','p',
                     'q','r','s','t','u','v','w','x',
                     'y','z'};

        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        a=st.nextToken().toCharArray();

        for(int i=0;i<26;i++){
            temp=-1;
            for(int j=0;j<a.length;j++){
                if(alphabet[i]==a[j]){
                    temp=j;
                    break;
                }
            }
            str+=temp+" ";
        }

        System.out.println(str);

    }
}