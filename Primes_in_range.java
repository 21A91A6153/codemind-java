import  java.util.Scanner;
class Prime
{
     public static boolean isPrime(int n)
     {
         int i;
        if(n<=1)
       {
           return false;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
       {
            if(n%i==0)
          {
               return  false;
            }
        }
      return true;
   }
      public static void main(String args[])
       {
            int n,m,c=0;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            m=sc.nextInt();
            for(int i=n;i<=m;i++)
           {
                if(isPrime(i))
                {
                    c++;
                }
            }
            System.out.println(c);
     }
}
