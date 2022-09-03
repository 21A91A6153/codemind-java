import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,d,h,i,b=0,j,k=0;
        double a;
        n=sc.nextInt();
        a=n*n;
        int temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            c++;
        }
        h=(int)a;
        for(i=0;i<c;i++)
        {
            d=h%10;
            h=h/10;
            b=b*10+d;
        }
        while(b!=0)
        {
            j=b%10;
            b=b/10;
            k=k*10+j;
        }
        if(k==temp)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
}