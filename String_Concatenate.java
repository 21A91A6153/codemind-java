import java.util.*;
class concat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2,s3,temp;
        int i,j;
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=s1.concat(s2);
        char[] ch = new char[s3.length()];
        for(i = 0; i < s3.length(); i++) 
        {
            ch[i] = s3.charAt(i);
        }
        Arrays.sort(ch);
        for(i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+"");
        }
    }
}