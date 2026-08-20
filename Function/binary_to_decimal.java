import java.util.*;
import java.lang.*;
import java.io.*;
class binary_to_decimal
{
    public static void main(String[] args)
   { 
     Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number whose decimal have to be converted ");
        num=sc.nextInt();
        int result=Decimal(num);
        System.out.println("BINARY : "+num+"\nDECIMAL : "+result);
        Binary();
    }
    static int Decimal(int num)
    {
        int d,pow,result=0,c=0;
        while(num!=0)
        {
            d=num%10;
            pow=(int)Math.pow(2,c)*d;
            c++;
            result=result+pow;
            num=num/10;
        }
        return result;
    }
    static void Binary()
    {
        System.out.println("Enter the number whose decimal have to be converted ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int d,n=num;
        String s="";
        while(num!=1)
        {
            d=num%2;
            s=d+s;
            num=num/2;
        }
        s=1+s;
        System.out.println("DECIMAL: "+n);
        System.out.println("BINARY: "+s);
    }
}