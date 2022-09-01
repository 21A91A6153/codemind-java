import java.util.Scanner;
class Display
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0,temp,d;
        a=sc.nextInt();
        temp=a;
        while(a!=0)
        {
            d=a%10;
            a=a/10;
            rev=rev*10+d;
        }
        if(rev==temp)
        {
            System.out.print("2");
        }
        else
        {
             System.out.print("1");
        }
    }
}