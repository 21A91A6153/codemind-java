import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int max=x[0];
        for(i=0;i<x.length;i++)
        {
            if(max<x[i])
            {
                max=x[i];
            }
        }
        System.out.print(max);
        
    }
}