import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                c+=i;
            }
        }
        if(c==a && s==b)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}