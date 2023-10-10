import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum=0;
        char[] c;

        s=br.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        c= st.nextToken().toCharArray();

        for(char ch:c){
            sum+=2;
            switch(ch){
                case 'A': case 'B': case 'C':
                    sum++;
                    break;
                case 'D': case 'E': case 'F':
                    sum+=2;
                    break;
                case 'G': case 'H': case 'I':
                    sum+=3;
                    break;
                case 'J': case 'K': case 'L':
                    sum+=4;
                    break;
                case 'M': case 'N': case 'O':
                    sum+=5;
                    break;
                case 'P': case 'Q': case 'R':case 'S':
                    sum+=6;
                    break;
                case 'T': case 'U': case 'V':
                    sum+=7;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum+=8;
                    break;
                case '0':
                    sum+=9;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}