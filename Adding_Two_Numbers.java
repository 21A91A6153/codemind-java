import java.util.Scanner;
class Temperatur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,f=0,d;
        c=sc.nextInt();
        d=sc.nextInt();
        f=c+d;
        System.out.print(f);
    }
}