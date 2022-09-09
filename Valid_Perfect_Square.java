import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int a,k,m,g;
        double h;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            k=sc.nextInt();
            h=Math.pow(k,0.5);
            g=(int)h;
            m=g*g;
            if(m==k)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        
    }
}