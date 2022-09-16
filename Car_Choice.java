import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        int n;
        float x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            x1=sc.nextFloat();
            x2=sc.nextFloat();
            y1=sc.nextFloat();
            y2=sc.nextFloat();
           // System.out.println(y1/x1);
           // System.out.println(y2/x2);
            if((y1/x1)<(y2/x2))
            {
                System.out.println("-1");
            }
            else if((y1/x1)==(y2/x2))
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
            
        }
    }
    
}