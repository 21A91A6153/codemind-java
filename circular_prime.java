import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,d,c=0,rev=0,fc=0;
        n=sc.nextInt();
        //temp=n;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                rev=rev*10+d;
            }
            for(i=1;i<=rev;i++)
            {
                if(rev%i==0)
                {
                    fc++;
                }
            }
            if(fc==2)
            {
                System.out.print("circular prime");
            }
            else
            {
                System.out.print("prime but not a circular prime");
            }
        }
        else
        {
            System.out.print("not prime");
        }
    }
}