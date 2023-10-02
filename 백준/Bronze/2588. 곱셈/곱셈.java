import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=b%10;
        int d=b%100/10;
        int e=b/100;
        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println((a*c)+(a*d*10)+(a*e*100));
    }
}