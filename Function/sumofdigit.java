import java.util.*;
class sumofdigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        checksum(num);
    }
    static void checksum(int num)
    {
        int sum=0,d;
        while(num!=0)
        {
            d=num%10;
            sum+=d;
            num=num/10;
        }
        System.out.println("Sum of Digits is: "+sum);
    }
}