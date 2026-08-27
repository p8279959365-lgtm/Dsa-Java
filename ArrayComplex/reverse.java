


import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose reverse has to be printed");
        int n=sc.nextInt();
        int num=n;
        int i,d,s=0,c=0;
        while(num>0)
        {
            d=num%10;
            if((s>Integer.MAX_VALUE/10)||((s==Integer.MAX_VALUE/10)&&(d>=7)))
            {
                ++c;
                break;
            }
            if((s<Integer.MIN_VALUE/10)||((s==Integer.MIN_VALUE)&&(d<=-8)))
            {
                ++c;
                break;
            }
            s=(s*10)+d;
            num=num/10;
        }
        if(c==0)
            System.out.println(s);
        else
            System.out.println("0");
    }
}