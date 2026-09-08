
import java.util.*;
class NumberOfComma
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  to be checked zero");
        long n=sc.nextLong();
        int comma=1,result=0;
        long start,end;
        long temp=n,count;
        start=1000;
        result=0;
        int c=0;
        while(temp!=0)
        {
            ++c;
            temp=temp/10;    
        }
        if(c<=3)
            System.out.println("Not possible");
        else
        {
        while(start<=n)
        {
            end=Math.min(n,start*1000-1);
            count=(end-start)+1;
            result+=comma*count;
            comma++;
            start=start*1000;
        }
        System.out.println("No of comma is :"+result);
    }

    
    }
    
}
