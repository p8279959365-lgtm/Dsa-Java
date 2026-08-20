import java.util.*;
class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked palindrome");
        int num=sc.nextInt();
        check_palindrome(num);
    }
    static void check_palindrome(int num)
    {
        int n=num,d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=(s*10)+d;
            n=n/10;
        }
        if(num==s)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not a palindrome number ");

    }
}