import java.util.Scanner;
class Fah
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        float c =(5*(f-32)/9);
        System.out.format("%.2f",c);
    }
}