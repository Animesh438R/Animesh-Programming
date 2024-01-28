public class MTest {
    void area_rectangle(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of the rectangle="+ar);
    }
    void perimeter_rectangle(int l,int b)
    {
        int pr=2*l*b;
        System.out.println("Perimeter of the rectangle="+pr);
    }
    public static void main(String[] args) {
        MTest ob=new MTest();
        ob.area_rectangle(5, 2);
        ob.perimeter_rectangle(5, 2);
    }
}
