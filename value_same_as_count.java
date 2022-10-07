import java.util.Scanner;
class Times
{
    public static void main(String args[])
    {
        int n,i,c=0,k,j,a=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<x.length;i++)
        {
            c=0;
            for(j=0;j<x.length;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c==x[i])
            {
                //System.out.print(x[i]+" ");
                x[i]=' ';
                a++;
            }
        }
        System.out.println(a);
    }
}