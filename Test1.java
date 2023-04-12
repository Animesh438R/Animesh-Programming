public class Test1 {
    void area_circle(int r)
    {
        double ar= 3.14*r*r;
        System.out.println("Area of circle="+ar);
    }
    public static void main(String[] args) {
        Test1 ob=new Test1();
        ob.area_circle(4);     
    }
}
