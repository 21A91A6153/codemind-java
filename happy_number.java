import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
        int res=0;
        n=sc.nextInt();
        while(n!=0)
       {
          d=n%10;
          n=n/10;
          res=res+d*d;
          if(n==0&&res>9)
          {
             n=res;
             res=0;
          }
       }
       if(res==1||res==7)
       {
          System.out.print("True");
       }
       else
      {
         System.out.print("False");
      }
    }
}