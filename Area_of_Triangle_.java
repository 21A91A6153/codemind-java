import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       float a,b,c;
       a=sc.nextFloat();
       b=sc.nextFloat();
       c=sc.nextFloat();
       float s,ar;
       s=(a+b+c)/2;
      // System.out.println(s);
       ar=(s*(s-a)*(s-b)*(s-c));
      // System.out.println(ar);
       double k = Math.pow(ar, 0.5);
       System.out.print(String.format("%.2f",k));
    }
}