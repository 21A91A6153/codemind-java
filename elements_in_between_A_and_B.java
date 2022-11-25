import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,l,i,j,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        //int y[]=new int[m];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        l=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=m && x[i]<=l)
            {
               System.out.print(x[i]+" ");
               c++; 
            }
        }
        if(c==0)
        {
            System.out.print(-1);
        }
    }
}