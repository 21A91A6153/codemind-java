import java.util.Scanner;
class Check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char  a;
        a=sc.nextLine().charAt(0);
        if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            System.out.println("Vowel");
        }
        else if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}