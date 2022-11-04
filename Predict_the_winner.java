import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a[],i,j,s=0,k=0;
        n=sc.nextInt();
        a=new int[100];
        for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
       for(i=0;i<n;i++)
      {
        if(i%2==0)
        {
            k=k+a[i];
        }
        else
        {
            s=s+a[i];
        }
      }
       m=Math.abs(k-s);
       if(m%4==0)
     {
        System.out.println("X");
      }
       else
      {
        System.out.println("Y");
      }
    }
}