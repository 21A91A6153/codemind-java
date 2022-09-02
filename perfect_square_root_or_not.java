import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double k;
        n=sc.nextInt();
        k=Math.pow(n,0.5);
        int g=(int)k;
        int m=g*g;
        if(m==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}