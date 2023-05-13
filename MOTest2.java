public class MOTest2 {
    void volume(int s)
    {
        int vol=s*s*s;
        System.out.println("Volume of the cube="+vol);
    }
    void volume(int l,int b,int h)
    {
        int vol=l*b*h;
        System.out.println("Volume of the cuboid="+vol);
    }
    void volume(double r)
    {
        double vol=(4*3.14*r*r*r)/3;
        System.out.println("Volume of the sphere ="+vol);
    }
    public static void main(String[] args) {
        MOTest2 ob=new MOTest2();
        ob.volume(5);
        ob.volume(8,5,6);
        ob.volume(6.5);
    }
}
