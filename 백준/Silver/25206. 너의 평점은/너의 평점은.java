import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        String mark;

        double gpa;
        double sum=0;
        double grade=0.0;
        double credit=0.0;
        double creditSum=0.0;

        while(true){
            s=br.readLine();
            if(s==null || s.isEmpty() || s.isBlank()){
                break;
            }else{
                st=new StringTokenizer(s);
                st.nextToken(" ");
                credit=Double.parseDouble(st.nextToken(" "));
                mark=st.nextToken(" ");

                switch (mark){
                    case "A+":
                        grade=4.5;
                        break;
                    case "A0":
                        grade=4.0;
                        break;
                    case "B+":
                        grade=3.5;
                        break;
                    case "B0":
                        grade=3.0;
                        break;
                    case "C+":
                        grade=2.5;
                        break;
                    case "C0":
                        grade=2.0;
                        break;
                    case "D+":
                        grade=1.5;
                        break;
                    case "D0":
                        grade=1.0;
                        break;
                    case "F":
                        grade=0.0;
                        break;
                    case "P":
                        grade=0.0;
                        credit=0.0;
                        break;
                }
                creditSum+=credit;
                sum+=(grade*credit);
            }
        }
        gpa=sum/creditSum;
        System.out.println(gpa);
    }
}
