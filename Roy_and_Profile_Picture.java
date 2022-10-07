import java.util.Scanner;
class Roy
{
    public static void main(String args[])
    {
        int l,w,h,n;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            //System.out.println(w);
            //System.out.println(h);
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(w==h)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}