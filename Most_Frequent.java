import java.util.Scanner;
class Frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,k=0,max=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                k=x[i];
            }
            else if(c==max)
            {
                if(k>x[i])
                {
                    k=x[i];
                }
            }
        }
        System.out.print(k);
    }
}
