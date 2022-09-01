import java.util.Scanner;
class Display
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0,temp,d,c=0;
        a=sc.nextInt();
        int x[],i;
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
           // System.out.print(x[i]+ " ");
        }
        for(int ele: x)
        {
            temp=ele;
            rev=0;
            while(ele!=0)
            {
                d=ele%10;
                ele=ele/10;
                rev=rev*10+d;
            }
            if(temp==rev)
            {
                c++;
            }
        }
        System.out.print(c);
        
    }
}