import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,d,rev=0,s=0,k;
        n=sc.nextInt();
        if(n>0)
        {
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                rev=rev*10+d;
            }
            System.out.print(rev);
        }
        else
        {
            //k=Math.abs(n);
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                s=s*10+d;
            }
            System.out.print(s);
        }
    }
}