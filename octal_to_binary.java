import java.util.Scanner;
class Octal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i=0,d,k;
        double rev=0;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=rev+d*Math.pow(8,i);
            i++;
            n=n/10;
        }
        k=(int)rev;
        System.out.print(Integer.toBinaryString(k));
    }
}