import java.util.Scanner;

public class MTest5 {
    int perimeter_triangle(int a,int b,int c)
    {
        int pr=a+b+c;
        return pr;
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int x,y,z,p;
        System.out.println("Enter the value of the first side-");
        x=scr.nextInt();
        System.out.println("Enter the value of the second side-");
        y=scr.nextInt();
        System.out.println("Enter the value of the third side-");
        z=scr.nextInt();
        MTest5 ob=new MTest5();
        p=ob.perimeter_triangle(x,y,z);
        System.out.println("The perimeter of the triangle="+p);
        scr.close();
    }
}
