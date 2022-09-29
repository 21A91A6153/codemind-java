import java.util.Scanner;
class Sum
{
    public static boolean isPrime(int n)
    {
        int i;
        if(n==1)
        {
            return false;
        }
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,i,c=0;
        int k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int m=0;
        for(i=0;i<x.length;i++)
        {
            if(isPrime(x[i]) && x[i]>=k)
            {
                //c+=x[i];
                m++;
            }
        }
        System.out.print(m);
    }
}