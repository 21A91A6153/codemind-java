import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[m];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(j=0;j<m;j++)
        {
            y[j]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    x[j]=-11;
                }
            }
        }
        for(j=0;j<m;j++)
        {
            for(i=j+1;i<m;i++)
            {
                if(y[j]==y[i])
                {
                    y[i]=-111;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                //System.out.println(x[i]+" "+y[j]);
                if(x[i]==y[j])
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}