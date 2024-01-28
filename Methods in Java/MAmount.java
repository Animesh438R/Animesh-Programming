import java.util.Scanner;
public class MAmount {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        int p,r,n;
        double a;
        System.out.println("Enter the monthly installment");
        p=scr.nextInt();
        System.out.println("Enter the rate of interest");
        r=scr.nextInt();
        System.out.println("Enter the time interval");
        n=scr.nextInt();
        a=p*Math.pow(1+r/100,n);
        System.out.println("Amount="+a);
        scr.close();
    }
}
