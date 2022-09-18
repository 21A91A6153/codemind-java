import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0,e=0,od=0,v=0;
        n=sc.nextInt();
        //int temp=n'
        while(n!=0)
       {
          d=n%10;
          n=n/10;
          c++;
          if(d%2==0)
          {
              e++;
          }
          else
          {
              od++;
          }
       }
       if(e==c)
       {
           System.out.println("Even");
       }
       else if(od==c)
       {
           System.out.println("Odd");
       }
       else //(c==(od+e))
       {
           System.out.println("Mixed");
       }
       
    }
}