import java.util.Scanner;
class Simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float p,t,r,s;
        p=sc.nextFloat();
        t=sc.nextFloat();
        r=sc.nextFloat();
        s=(p*t*r)/100;
        System.out.println((int)s);
    }
}