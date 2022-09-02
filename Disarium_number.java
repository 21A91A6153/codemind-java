import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0;
        double m=0;
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            c++;
        }
        int k=temp;
        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            m=m+Math.pow(d,c);
            //System.out.println(m);
            c--;
        }
        //System.out.print(n);
        if(k==(int)m)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}