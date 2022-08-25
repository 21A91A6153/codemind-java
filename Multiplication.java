import java.util.Scanner;
class Multiplication
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,m,c=1;
       n=sc.nextInt();
       m=sc.nextInt();
       c=c*n*m;
       System.out.print(c);
    }
}