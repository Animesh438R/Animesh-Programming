public class Practice {
    void area_square(int s)
    {
        int ar= s*s;
        System.out.println("Area of the square="+ar);
    }
    void area_rectangle(int l,int b)
    {
        int ar1=l*b;
        System.out.println("Area of the rectangle="+ar1);
    }
    void area_triangle(int b,int h)
    {
        int ar2=(b*h)/2;
        System.out.println("Area of the triangle="+ar2);  
    }
    public static void main(String[] args) {
        Practice ob=new Practice();
        ob.area_square(4);
        ob.area_rectangle(5, 7);
        ob.area_triangle(8, 6);
    }   
}
