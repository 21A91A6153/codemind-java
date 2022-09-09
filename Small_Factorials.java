import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int a,k,m=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            k=sc.nextInt();
            m=1;
            while(k!=0)
            {
                m=m*k;
                k--;
                
            }
            System.out.println(m);
            
        }
        
        
    }
}