import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        char[] str;
        String result="";

        s=br.readLine();
        str=s.toCharArray();

        for(int i=str.length-1;i>=0;i--){
            result+=str[i];
        }

        if(s.equals(result)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
