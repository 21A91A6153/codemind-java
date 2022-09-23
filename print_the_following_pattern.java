import  java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int r,c,i;
         r=sc.nextInt();
         for(i=1;i<=r;i++)
         {
             for(int j=1;j<=r-i+1;j++)
             {
                 System.out.print(j+"");
             }
             System.out.println();
         }
   }
}