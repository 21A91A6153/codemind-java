import java.util.Scanner;
class Disk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        System.out.println(2*n*m*k*512);
    }
}