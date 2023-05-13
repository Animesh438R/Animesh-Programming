public class MOTest3 {
    void perimeter(int s)
    {
        int pr=4*s;
        System.out.println("Perimeter of the square="+pr);
    }
    void perimeter(int l,int b)
    {
        int pr=2*(l+b);
        System.out.println("Perimter of the rectangle="+pr);
    }
    void perimeter(double r)
    {
        double pr=2*3.14*r;
        System.out.println("Perimeter of the circle="+pr);
    }
    public static void main(String[] args) {
        MOTest3 ob=new MOTest3();
        ob.perimeter(8);
        ob.perimeter(4,3);
        ob.perimeter(7);
    }
}
