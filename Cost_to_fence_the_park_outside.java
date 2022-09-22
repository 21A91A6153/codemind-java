import java.util.Scanner;
class Fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l =sc.nextInt();
        int b =sc.nextInt();
        int w =sc.nextInt();
        int c =sc.nextInt();
        int ia=l*b;
        int oa=l*b+2*w*b+2*w*l+4*w*w;
        int area=oa-ia;
        int f=area*c;
        System.out.println(f);
    }
}