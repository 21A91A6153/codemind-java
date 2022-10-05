import java.util.Scanner;
class Ascending
{
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
        for(i=0;i<x.length-1;i++)
        {
            if(x[i]>x[i+1])
            {
                c++;
            }
        }
        //System.out.print(c);
        if(c==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
    }
}