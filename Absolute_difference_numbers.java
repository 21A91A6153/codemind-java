import java.util.Scanner;
class Absolute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,d,s=0,temp,p=0,z=0,rev=0;
        n=sc.nextInt();
        m=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s=s*10+d;
        }
        for(int i=0;i<m;i++)
        {
            d=temp%10;
            temp=temp/10;
            p=p*10+d;
        }
        for(int i=0;i<m;i++)
        {
            d=s%10;
            s=s/10;
            z=z*10+d;
        }
        while(p!=0)
        {
           d=p%10;
           p=p/10;
           rev=rev*10+d;
        }
        System.out.print(Math.abs(z-rev));
    }
}