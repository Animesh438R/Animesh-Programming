public class Practice2 {
    int volume_cube(int s)
    {
        int vol= s*s*s;
        return vol;
    }
    int volume_cuboid(int l,int b, int h)
    {
        int vol1=l*b*h;
        return vol1;
    }
    double volume_sphere(int r)
    {
        double vol2=(4*3.14*r*r*r)/3;
        return vol2;
    }
    public static void main(String[] args) {
        Practice2 ob= new Practice2();
        int x= ob.volume_cube(4);
        int y=ob.volume_cuboid(5,7,9);
        double z= ob.volume_sphere(3);

        System.out.println("volume of the cube="+x);
        System.out.println("volume of the cuboid="+y);
        System.out.println("volume of the sphere="+z);
    }
}
