public class Rectangle1 {
    void area(int l,int b)
    {
        int ar=l*b;
        
        l=l+8;
        System.out.println("Inside length(),l="+l);
        b=b+8;
        System.out.println("Inside breadth()="+b);
        System.out.println("Area="+ar);

    }
    public static void main(String[] args) {
        Rectangle ob=new Rectangle();
        int x=20,y=15;
        System.out.println("Before length(),x="+x);
        System.out.println("Before breadth(),y="+y);
        ob.area(x, y);
        System.out.println("Length="+x);
        System.out.println("Breadth="+y);

    }
}

