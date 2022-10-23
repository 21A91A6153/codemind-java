import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,m,r,k,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            m=sc.nextInt();
            r=sc.nextInt();
            c=0;
            for(j=m;j<=r;j++)
            {
                k=j%10;
                if (k==2 || k==3 || k==9)
                {
                    c++;
                }
                else
                {
                    k=0;
                    continue;
                }
            }
            System.out.println(c);
        }
    }
}