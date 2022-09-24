import  java.util.Scanner;
class Mathh
{
    public static boolean isPrime(int n)
  {
     if(n<1)
        return false;
    for(int i=2;i<=(int)Math.sqrt(n);i++)
   {
       if(n%i==0)
          return false;
    }
   return true;
  }
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
       int n,m;
       n=sc.nextInt();
       for(int i=n+1;i<n*n;i++)
       {
       if(isPrime(i) && isPalindrome(i))
       {
            System.out.println(i);
            break;
       }
       }
    }
  }