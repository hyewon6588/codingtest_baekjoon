import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,str1,str2,str="";
        char tmp;
        int a,b;
        char[] c;

        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        str1= st.nextToken();
        c=str1.toCharArray();
        tmp=c[0];
        c[0]=c[2];
        c[2]=tmp;
        for(char ch:c){
            str+=ch;
        }
        a=Integer.parseInt(str);

        str="";
        str2=st.nextToken();
        c=str2.toCharArray();
        tmp=c[0];
        c[0]=c[2];
        c[2]=tmp;
        for(char ch:c){
            str+=ch;
        }
        b=Integer.parseInt(str);

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}