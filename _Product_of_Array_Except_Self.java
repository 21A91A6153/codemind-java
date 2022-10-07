import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        int n,i,mul=1,k=0,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<x.length;i++)
        {
            mul=1;
            k=0;
            for(j=0;j<x.length;j++)
            {
                if(x[i]==x[j])
                {
                    continue;
                }
                mul=mul*x[j];
            }
            System.out.print(mul+" ");
        }
        
    }
}