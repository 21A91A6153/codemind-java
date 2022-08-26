import java.util.Scanner;
class Temperatur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,f=0;
        c=sc.nextInt();
        f=(c*(c-1))/2;
        System.out.print(f);
    }
}