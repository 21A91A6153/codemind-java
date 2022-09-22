import java.util.Scanner;
class Fah
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        float c =((9*f)/5+32);
        System.out.format("%.2f",c);
    }
}