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
        float max=0;
        for(i=0;i<x.length;i++)
        {
            max=max+x[i];
        }
        int c=0;
        for(i=0;i<x.length;i++)
        {
            if(x[i]==(int)(max/n))
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        
        
    }
}