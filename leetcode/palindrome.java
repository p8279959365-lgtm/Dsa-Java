import java.util.*;
class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter then number tobe checked palindrome");
        int n=sc.nextInt();
        int temp=n;
        int d=0,s=0;
        if(n<0)
            System.out.println("NOT PALINDROME NUMBER ");
        else
        {
        while(temp!=0)
        {
            d=temp%10;
            s=(s*10)+d;
            temp=temp/10;
        }
        if(s==n)
            System.out.println("IT'S A PALINDROME NUMBER ");
        else
            System.out.println("IT'S NOT PALINDROME NUMBER ");
        }
    }
}