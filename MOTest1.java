public class MOTest1 {
    void area(int s)
    {
        int ar=s*s;
        System.out.println("Area of the Square="+ar);
    }
    void area(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of the Rectangle="+ar);
    }
    void area(double r)
    {
        double ar=3.14*r*r;
        System.out.println("Area of the Circle="+ar);
    }
    public static void main(String[] args) {
        MOTest1 ob=new MOTest1();
        ob.area(4);
        ob.area(8,5);
        ob.area(5.6);
    }
}
