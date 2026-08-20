import java.util.*;
class primenumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked prime ");
        int n=sc.nextInt();
        checkprime(n);
    }
    static void checkprime(int n)
    {
        int i,c=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
                ++c;
        }
        if(c==0)
            System.out.println(n+" IS A PRIME NUMBER ");
        else
            System.out.println(n+" IS NOT A PRIME NUMBER");
    }
}