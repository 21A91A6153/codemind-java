import java.util.Scanner;
class Multiplication
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       float n,m,c=1;
       n=sc.nextFloat();
       m=sc.nextFloat();
       c=c*n*m;
       System.out.print(String.format("%.2f",c));
    }
}