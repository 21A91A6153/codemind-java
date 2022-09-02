import java.util.Scanner;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,i;
        n=sc.nextInt();
        a=sc.nextInt();
        for(i=1;i<=a;i++)
       {
           if(i%2==1)
           System.out.println(n+" "+"x"+" "+i+" "+"="+" "+n*i);
       }
        
    }
}