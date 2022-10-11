import java.util.Scanner;
class Sum
{
    public static boolean isSquare(int n)
    {
        float k;
        k=(int)Math.sqrt(n);
        if(k*k==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<x.length;i++)
        {
            if(isSquare(x[i]))
            {
                c+=x[i];
            }
        }
        System.out.println(c);
    }
}