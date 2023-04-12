public class Text3 {
    int area_square(int s)
    {
        int ar=s*s;
        return ar;
    }
    public static void main(String[] args) {
        Text3 ob=new Text3();
        int x=ob.area_square(10);
        System.out.println("Area of the square="+x);
    }
}
