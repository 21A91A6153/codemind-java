import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,s=0,c=0,k=0,t=0;
        n=sc.nextInt();
        while(n!=0)
      {
        d=n%10;
        n=n/10;
        s=s+d;
      }
        while(s!=0)
      {
        d=s%10;
        s=s/10;
        c++;
        k=k+d;
      }
        if(c==2)
      {
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            t=t+d;
        }
        System.out.print(t);
      }
        else
      {
        System.out.print(k);
      }
    }
}