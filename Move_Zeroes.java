import java.util.Scanner;
import java.util.Arrays;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,max=-1,k=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]!=0)
            {
                System.out.print(x[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(x[i]==0)
            {
                System.out.print(x[i]+" ");
            }
        }
    }
}