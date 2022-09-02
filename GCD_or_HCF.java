import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,gcd=0,i;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=n && i<=m;i++)
        {
            if(n%i==0 && m%i==0)
            {
                gcd=i;
            }
        }
        System.out.print(gcd);
    }
}