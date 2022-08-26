import java.util.Scanner;
class Temperatur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c;
        float f=0;
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.print(String.format("%.2f",f));
    }
}