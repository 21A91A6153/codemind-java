import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,x[],sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        System.out.print(sum);
    }
}