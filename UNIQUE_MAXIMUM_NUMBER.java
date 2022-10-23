import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,max=-1,k=0;
        n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                y[i]=x[i];
                k++;
            }
        }
        if(k==0)
        {
            System.out.print(-1);
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(max<y[i])
                {
                    max=y[i];
                }
            }
            System.out.print(max);
        }
        
    }
}