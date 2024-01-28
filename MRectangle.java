public class MRectangle {
    void area(int l,int b)
    {
        int ar=l*b;
        System.out.println("Area of the rectangle="+ar);
    }
    void perimeter(int l,int b)
    {
        int pr=2*(l+b);
        System.out.println("Perimeter of the rectangle="+pr);
    }
    public static void main(String[] args) {
        MRectangle ob=new MRectangle();
        ob.area(8, 6);
        ob.perimeter(8, 6);
    }
}
