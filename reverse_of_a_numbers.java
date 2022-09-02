import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            rev=rev*10+d;
        }
        System.out.print(rev);
    }
}