import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        b=b-45;
        if(b<0){
            a--;
            b+=60;
        }

        if (a < 0) {
            a+=24;
        }
        System.out.println(a+" "+b);
    }
}