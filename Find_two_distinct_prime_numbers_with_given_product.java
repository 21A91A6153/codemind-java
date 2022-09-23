import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(i*j==n)
                {
                    c+=1;
                    System.out.println(i+" "+j);
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}