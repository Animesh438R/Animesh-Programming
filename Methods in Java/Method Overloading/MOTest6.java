public class MOTest6 {
    void volume(int s)
    {
        int vol= s*s*s;
        System.out.println("Volume of the cube="+vol);
    }
    int volume(int l, int b, int h)
    {
        int vol1=l*b*h;
        return vol1;
    }
    void volume(double r)
    {
        double vol2=(4*3.14*r*r*r)/3;
        System.out.println("Volume of the sphere ="+vol2);
    }
    public static void main(String[] args) {
        MOTest6 ob=new MOTest6();
        ob.volume(4);
        int x=ob.volume(9,7,4);
        ob.volume(4.2);
        System.out.println("Volume of the cuboid="+x);
    }
}
