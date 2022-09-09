import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int a,k,m,n;
        double g;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        k=sc.nextInt();
        m=sc.nextInt();
        g=Math.pow(a,k);
        n=(int)g;
        System.out.print(n%m);
        
        
    }
}