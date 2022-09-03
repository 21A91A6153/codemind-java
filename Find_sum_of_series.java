import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float s=0;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            s=s+(float)1/i;
        }
        System.out.format("%.2f",s);
    }
}