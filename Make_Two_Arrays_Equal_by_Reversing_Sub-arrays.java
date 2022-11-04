import java.util.Scanner;
import java.util.Arrays;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,c=0,p=0,j,m;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
       m=sc.nextInt();
       int x[]=new int[m];
       for(j=0;j<m;j++)
       {
           x[j]=sc.nextInt();
       }
       Arrays.sort(arr);
       Arrays.sort(x);
       for(i=0;i<n;i++)
       {
           if(arr[i]==x[i])
           {
               c++;
           }
       }
       if(c==n)
       {
           System.out.print("True");
       }
       else
       {
           System.out.print("False");
       }
    }
}