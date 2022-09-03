import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=0,c=0,d,e=0,f=0,g=0,h=0,i=0,j=0;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(d==1)
            a++;
            else if(d==2)
            b++;
            else if(d==3)
            c++;
            else if(d==4)
            e++;
            else if(d==5)
            f++;
            else if(d==6)
            g++;
            else if(d==7)
            h++;
            else if(d==8)
            i++;
            else if(d==9)
            j++;
        }
        if(a>1 || b>1 || c>1 || e>1 || f>1 || g>1 || h>1 || i>1 || j>1)
        System.out.print("Not Unique Number");
        else
        System.out.print("Unique Number");
        
    }
}