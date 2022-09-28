import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,c=0,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=1;i<x.length-1;i++)
        {
            if(x[i-1]%2==0 && x[i+1]%2==1)
            {
                if(i!=n-1)
                {
                    c++;
                }
            }
            else if(x[i-1]%2==1 && x[i+1]%2==0)
            {
                if(i!=n-1)
                {
                    k++;
                }
            }
        }
        System.out.print(c+k);
    }
}