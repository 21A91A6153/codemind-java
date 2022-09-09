import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        int a,k=1,sum=0,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a!=0)
        {
            d=a%10;
            a=a/10;
            sum=sum+d;
            k=k*d;
        }
        if(sum==k)
        {
           System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
        
    }
}