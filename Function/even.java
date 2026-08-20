import java.util.*;
class even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked even ");
        int num=sc.nextInt();
        boolean result=check_even(num);
        if(result==true)
            System.out.println("Even number");
        else 
            System.out.println("Odd number");
    }
    static boolean check_even(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }
}