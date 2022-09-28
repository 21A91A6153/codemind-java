import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,x[],c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}