public class Text {
    int area_rectangle(int l,int b )
    {
        int ar=l*b;
        return ar;
    }
    public static void main(String[] args) {
        Text ob=new Text();
        int x=ob.area_rectangle(5, 6);
        System.out.println("Area of rectangle="+x);
    }
}
