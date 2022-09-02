import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,gcd=0,i,d;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(gcd<d)
            {
                gcd=d;
            }
        }
        System.out.print(gcd);
    }
}