import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        //int y[]=new int[m];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
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
        for(i=0;i<n;i++)
        {
                if(x[i]%2==0)
                {
                    c++;
                }
        }
        System.out.print(c);
    }
}