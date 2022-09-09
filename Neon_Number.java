import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        int a,k,sum=0,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        k=a*a;
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            sum=sum+d;
        }
        if(sum==a)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        
    }
}