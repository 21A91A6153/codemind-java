import java.util.Scanner;
class Polygon
{
    public static void main(String args[])
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n*(n-3)/2;
        System.out.println(a);
    }
}