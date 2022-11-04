import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,c=0,p=0,j;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
      {
        if(i%2==0)
        {
           // System.out.print(arr[i]);
            for(j=0;j<arr[i];j++)
            {
                System.out.print(arr[i+1]+" ");
            }
        }
      }
    }
}