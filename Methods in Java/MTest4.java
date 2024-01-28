import java.util.Scanner;

public class MTest4 {
    double volume_sphere(int rad)
    {
        double vol=(4*3.14*rad*rad*rad)/3;
        return vol;
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int r;
        double v;
        System.out.println("Enter the radius=");
        r=scr.nextInt();
        MTest4 ob=new MTest4();
        v=ob.volume_sphere(r);
        System.out.println("Volume of the sphere ="+v);
        scr.close();
    }
}
