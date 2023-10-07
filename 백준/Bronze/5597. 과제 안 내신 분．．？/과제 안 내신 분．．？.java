import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] student=new int[30];
        int sub;
        String s;

        for(int i=0;i<28;i++){
            s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            sub=Integer.parseInt(st.nextToken())-1;
            student[sub]=1;
        }

        for(int i=0;i<student.length;i++){
            if(student[i]==0){
                System.out.println(i+1);
            }
        }

    }
}