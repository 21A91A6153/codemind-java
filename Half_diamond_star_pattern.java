import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i;
         r=sc.nextInt();
         //System.out.print(r);
        if(r>=3 && r<=100)
        {
           for(i=1;i<=2*r-1;i++)
          {
            int k=i<=r?i:r-i% r;
            for(int j=1;j<=k;j++)
               System.out.print("*"); 
            System.out.println();
          }
        }
        else
        {
            System.out.print("The pattern is not possible");
        }
   }
}