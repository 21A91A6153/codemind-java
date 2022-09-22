import java.util.Scanner;
class Palindrome
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
   else
  {
       return  false;
   }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,d;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}