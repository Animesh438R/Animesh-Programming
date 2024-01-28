public class MTest1 {
    void area_circle(int r)
    {
        double ar=3.14*r*r;
        System.out.println("Area of the circle="+ar);
    }
    void circumference_circle(int r)
    {
        double c=2*3.14*r;
        System.out.println("Circumference of the circle="+c);
    }
    public static void main(String[] args) {
        MTest1 ob=new MTest1();
        ob.area_circle(7);
        ob.circumference_circle(7);
    }
}
