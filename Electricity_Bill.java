import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=0,n;
        double l,a=0;
        String m,k;
        m=sc.nextLine();
        k=sc.nextLine();
        n=sc.nextInt();
        if(n<200)
        {
            l=n*1.20;
        }
        else if(n>=200 && n<400)
        {
            l=n*1.50;
        }
        else if(n>=400 && n<600)
        {
            l=n*1.80;
        }
        else
        {
            l=n*2.00;
        }
        if(n>400)
        {
            a=l*15/100;
            System.out.format("%.2f",(l+a));
        }
        else
        {
            a=100;
            System.out.format("%.2f",(l+a));
        }
        
    }
}