import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,c=0,k=0,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                System.out.print(x[i]+" ");
            }
        }
        for(i=0;i<x.length;i++)
        {
            if(x[i]%2==1)
            {
                System.out.print(x[i]+" ");
            }
        }
    }
}