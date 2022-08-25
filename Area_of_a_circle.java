import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       float r;
       double area;
       r=sc.nextFloat();
       area=(3.14*r*r);
       System.out.print(String.format("%.2f", area));
    }
}