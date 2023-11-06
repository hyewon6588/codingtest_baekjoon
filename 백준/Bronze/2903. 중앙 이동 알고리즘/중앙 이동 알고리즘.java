import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double n=Integer.parseInt(br.readLine());

        double r=Math.pow((Math.pow(2,n)+1),2);

        System.out.println(Math.round(r));

    }
}
