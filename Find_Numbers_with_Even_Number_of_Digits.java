import java.util.Scanner;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,arr[],i,c=0,d,h=0;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int ele: arr)
       {
          c=0;
          while(ele!=0)
          {
              d=ele%10;
              ele=ele/10;
              c++;
          }
          if(c%2==0)
          {
              h++;
          }
          
       } 
       System.out.print(h);
    }
}