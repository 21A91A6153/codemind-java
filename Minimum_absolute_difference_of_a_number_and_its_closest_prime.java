import java.util.Scanner;
class Closest
{
    public static boolean isPrime(int n)
    {
        int i,j;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            //return true;
        }
        return true;
   }
    public static void main(String args[])
    {
        int n,i,j=0,k=0,g=0,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //System.out.print(n);
        for(i=n+1;i<n*n;i++)
        {
            if(isPrime(i))
            {
                k=i;
                break;
            }
        }
        for(i=n-1;i>2;i--)
        {
            if(isPrime(i))
            {
                g=i;
                break;
            }
        }
        if(isPrime(n))
        {
            System.out.print(0);
        }
        else
        {
            j=Math.abs(n-k);
            l=Math.abs(n-g);
            if(j<l)
            {
                System.out.print(j);
            }
            else
            {
                System.out.print(l);
            }
        }
    }
}