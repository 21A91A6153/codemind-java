import java.util.Scanner;
class Index
{
    public static void main(String args[])
    {
        int n,i,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=(x.length-1);i>=0;i--)
        {
            if(x[i]%2==1)
            {
                System.out.print(i);
                break;
            }
        }
    }
}