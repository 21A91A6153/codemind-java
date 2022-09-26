import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int n,x[],i,m,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(i=0;i<x.length;i++)
        {
            if(x[i]==m)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}