import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       float n,m;
       float avg=0;
       n=sc.nextFloat();
       m=sc.nextFloat();
       avg=(n+m)/2;
       System.out.print(String.format("%.4f", avg));
    }
}