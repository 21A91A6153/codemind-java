import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i;
         r=sc.nextInt();
         for(i=r;i>=1;i--)
         {
             for(int j=r;j>=1;j--)
             {
                System.out.print(j+" ");
             }
             System.out.println();
         }
   }
}