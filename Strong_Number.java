import java.util.Scanner;
class Strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,sum=0,k=1,temp;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            k=1;
            while(d!=0)
            {
                k=k*d;
                d--;
            }
            sum=sum+k;
        }
        if(temp==sum)
        {
            System.out.print("The number "+temp+" is a strong number");
        }
        else
        {
            System.out.print("The number "+temp+" is not a strong number");
        }
    }
}