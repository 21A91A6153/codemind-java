import java.util.Scanner;
class Almost
{
    public static boolean isPrime(int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,j,k,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            m=sc.nextInt();
            c=0;
            for(j=1;j<m;j++)
           {
               for(k=j;k<m;k++)
              {
                if(k*j==m && isPrime(k) && isPrime(j) && k!=j)
               {
                  c+=1;
               }
              }
            }
            if(c>=1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}