import java.io.*;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,result="";
        String[][] str=new String[5][15];
        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                str[i][j]="";
            }
        }
        for(int i=0;i<5;i++){
            s=br.readLine();
            for(int j=0;j<15;j++){
                if(j<s.length()) {
                    str[i][j] +=s.charAt(j);
                }
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(str[j][i]!=""){
                    result+=str[j][i];
                }
            }
        }
        System.out.println(result);
    }
}
