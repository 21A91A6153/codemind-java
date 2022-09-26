import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int n,x[],i,m,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        //m=sc.nextInt();
        for(i=(x.length-1);i>=0;i--)
        {
            if(x[i]%2==0)
            {
                System.out.print(x[i]);
                break;
            }
        }
    }
}