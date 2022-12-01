import java.util.Scanner;
class Arrays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,max=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        //int y[]=new int[n];
        for(i=0;i<n;i++)
        {
            max=-1;
            for(j=i+1;j<n;j++)
            {
                if(max<x[j])
                {
                    max=x[j];
                }
            }
            System.out.print(max+" ");
        }
        
    }
}