import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,d,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                System.out.print("YES");
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("NO");
        }
    }
}