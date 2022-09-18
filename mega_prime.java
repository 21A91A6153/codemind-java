import java.util.Scanner;
class Mega
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0,fc=0,k=0,g=0,e,temp;
        n=sc.nextInt();
       // System.out.print(n);
        temp=n;
        //System.out.print(temp);
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                fc++;
            }
        }
        if(fc==2)
        {
            //int temp=n;
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                c=0;
                for(int j=1;j<=d;j++)
                {
                    if(d%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    k++;
                }
            }
        }
        while(temp!=0)
        {
            e=temp%10;
            temp=temp/10;
            g++;
        }
        if(g==k)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}