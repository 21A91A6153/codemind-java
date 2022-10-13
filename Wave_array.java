import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        if(x[0]<x[1])
       {
        for(i=0;i<x.length;i++)
        {
            if(i%2==1 && i<n)
            {
                if(x[i-1]>x[i])
                {
                    c+=1;
                    break;
                }
            }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    if(x[0]>x[1])
    {
        for(i=0;i<x.length;i++)
        {
            if(i%2==1 && i<n)
            {
                if(x[i-1]<x[i])
                {
                    c+=1;
                    break;
                }
            }
        }
        if(c==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
  }
}