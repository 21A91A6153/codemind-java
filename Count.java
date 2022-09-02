import java.util.Scanner;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,arr[],i,c=0,d,h=0,f=0;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           // System.out.print(arr[i]+" ");
        }
        for(int ele: arr)
       {
          if(ele%2==0)
          {
              h++;
          }
          else
          {
              f++;
          }
       } 
       System.out.println(h+" "+f);
    }
}