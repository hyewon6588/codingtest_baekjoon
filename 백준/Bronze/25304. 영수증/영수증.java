import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        int n=sc.nextInt();
        long a;
        int b;
        long sum=0;
        for(int i=1;i<=n;i++){
            a=sc.nextLong();
            b=sc.nextInt();
            sum+=a*b;
        }

        if(sum==x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}