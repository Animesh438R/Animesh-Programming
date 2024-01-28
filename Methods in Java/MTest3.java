import java.util.Scanner;

public class MTest3 {
    void area_rectangle(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of the rectangle="+ar);
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a-");
        a=scr.nextInt();
        System.out.println("length of the rectangle="+a);
        System.out.println("Enter the value of b-");
        b=scr.nextInt();
        System.out.println("Breadth of the rectangle="+b);
        MTest ob=new MTest();
        ob.area_rectangle(a,b);
        scr.close();

    }
}
