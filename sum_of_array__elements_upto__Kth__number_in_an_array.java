import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,i,k,sum=0;
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
            if(x[i]==k)
            {
                m=i;
                break;
            }
        }
        for(i=0;i<=m;i++)
        {
            sum+=x[i];
        }
        System.out.print(sum);
    }
}