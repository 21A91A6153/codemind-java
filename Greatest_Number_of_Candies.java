import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],m,max=0,v[];
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
           // System.out.println(x[i]);
        }
        m=sc.nextInt();
        for(int ele: x)
        {
            if(max<ele)
            {
                max=ele;
            }
        }
        for (int j: x)
        {
            if (m+j>=max)
            {
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
        //for(i=0;i<n;i++)
        //System.out.print(v[i]);
        
    }
}