import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int b;
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            sum[i]=a+b;
        }

        for(int i=0;i<n;i++){
            System.out.println(sum[i]);
        }
    }
}