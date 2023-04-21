public class Rectangle {
    void area(int l,int b)
    {
        int ar=l*b;
        
        l=l+8;
        b=b+8;
        System.out.println("Area="+ar);

    }
    public static void main(String[] args) {
        Rectangle ob=new Rectangle();
        int x=20,y=15;
        ob.area(x, y);
        System.out.println("Length="+x);
        System.out.println("Breadth="+y);

    }
}
