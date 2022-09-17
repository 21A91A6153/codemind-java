import java.util.Scanner;
class Robber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,odd=0,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           x=sc.nextInt();
          if(x%2!=0)
          {
            odd++;
          }
        }
        if(odd<=2)
        {
           System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}