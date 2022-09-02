import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n,d;
        int c=0;
        n=sc.nextLong();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            c++;
        }
        if(c==10)
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}