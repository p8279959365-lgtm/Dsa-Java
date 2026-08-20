import java.util.*;
class prime_range
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int start,end;
        System.out.println("enter the range ");
        start=sc.nextInt();
        end=sc.nextInt();
        prime(start,end);
    }
    static void prime(int start,int end)
    {
        int i,c;
        for(i=start;i<=end;i++)
        {
            c=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==0)
                System.out.println(i+" is a Prime Number ");
        }
    }
}