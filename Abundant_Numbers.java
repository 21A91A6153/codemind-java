import java.util.Scanner;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,i,c=0;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c=c+i;
                //System.out.print(i);
            }
        }
       // System.out.print(c);
        if(c>n)
        System.out.print("True");
        else
        System.out.print("False");
        
    }
}