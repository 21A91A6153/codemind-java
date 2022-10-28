import java.util.Scanner;
class Sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,c=0,k=0;
        int n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(i=0;i<x.length;i++)
        {
            if(x[i]==m)
            {
                System.out.print(i+" ");
                c++;
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(x[i]==m)
            {
                System.out.print(i+" ");
                k++;
                break;
            }
        }
        if(c==0)
        {
            System.out.print(-1+" ");
        }
        if(k==0)
        {
            System.out.print(-1+" ");
        }
    }
}