class Interest
{
    int p,r,t;
    double si;

    Interest()
    {
        p=0;
        r=0;
        t=0;
    }
    Interest(int x, int y, int z)
    {
        p=x;
        r=y;
        t=z;
    }
    void compute()
    {
        si=(p*r*t)/100;
        System.out.println("Interest="+si);
    }
    public static void main(String[] args) {
        Interest ob= new Interest();
        Interest ob1= new Interest(2000, 12, 4);
        ob.compute();
        ob1.compute();
    }
}