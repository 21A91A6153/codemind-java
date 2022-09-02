import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            if(c==n)
            {
                System.out.print("True");
                break;
            }
            else if(c>n)
            {
                System.out.print("False");
                break;
            }
            a=b;
            b=c;
        }
    }
}