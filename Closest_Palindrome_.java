import java.util.Scanner;
class Closest
{
    public static boolean isPalindrome(int n)
    {
        int flag=0;
        int d=(int)Math.log10(n);
        while(n>0)
       {
         int  r1=n%10;
         int r2=n/(int)Math.pow(10,d);
         if(r1!=r2)
        {
          flag=1;
          break;
        }
         n=n%(int)Math.pow(10,d);
         n=n/10;
         d-=2;
       }
       if(flag==0)
       {
         return  true;
       }
       return false;
   }
    public static void main(String args[])
    {
        int n,i,j,k=0,g=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;i<n*n;i++)
        {
            if(isPalindrome(i))
            {
                k=i;
                break;
            }
        }
        for(i=n-1;i>2;i--)
        {
            if(isPalindrome(i))
            {
                g=i;
                break;
            }
        }
       //System.out.print(k+" "+g);
       if(Math.abs(n-k)==Math.abs(n-g))
       {
           System.out.print(g+" "+k);
       }
       if(Math.abs(n-k)<Math.abs(n-g))
       {
           System.out.print(k);
       }
       if(Math.abs(n-k)>Math.abs(n-g))
       {
           System.out.print(g);
       }
    }
}