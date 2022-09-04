import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,d,rev=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            m=sc.nextInt();
            int temp=m;
            rev=0;
            while(m!=0)
            {
                d=m%10;
                m=m/10;
                rev=rev*10+d;
            }
            //System.out.print(rev);
            if(rev==temp)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}