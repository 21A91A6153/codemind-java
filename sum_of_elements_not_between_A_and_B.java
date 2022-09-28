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
        int m=sc.nextInt();
        int a=sc.nextInt();
        for(i=0;i<x.length;i++)
        {
            if(x[i]>=m && x[i]<=a)
            {
                continue;
            }
            else
            {
                c+=x[i];
            }
        }
        System.out.print(c);
    }
}