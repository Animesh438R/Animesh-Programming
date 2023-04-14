public class MTest2 {
    void area_rectangle(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of the rectangle="+ar);
    }
    int perimeter_rectangle(int l,int b)
    {
        int pr=2*(l+b);
        return pr;
    }
    public static void main(String[] args) {
        MTest2 ob=new MTest2();
        ob.area_rectangle(5, 8);
        int x=ob.perimeter_rectangle(5, 8);
        System.out.println("Perimeter of rectangle="+x);
    }   
}
