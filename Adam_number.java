import java.util.Scanner;
class Adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,d,e,m,s=0,v,k;
        n=sc.nextInt();
        k=n*n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            sum=sum*10+d;
        }
        m=sum*sum;
        e=sum;
        while(m!=0)
        {
            v=m%10;
            m=m/10;
            s=s*10+v;
        }
       
        if(s==k)
        System.out.print("True");
        else
        System.out.print("False");
    }
}