


import java.util.*;
class LexioGraphicallyLongest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        String s=sc.nextLine();
        int len=s.length();
        System.out.println("ENter the number of 1s");
        int k=sc.nextInt();
        int i,j,zero;
        String temp="",result="";
        for(i=k;i<=len;i++)
        {
            
            for(j=0;j<=len-i;j++)
            {
                zero=0;
                temp=s.substring(j,j+i);
                for(char ch:temp.toCharArray())
                {
                    if(ch=='1')
                    {
                        ++zero;
                    }
                }
                if(zero==k)
                {
                    if(result.compareTo("")==0|| temp.compareTo(result)<0)
                    {
                        result=temp;
                    }
                }
            }

            if(result.compareTo("")!=0)
            {
                System.out.println("Samllest lexo: "+result);
                break;
            }

        }
    }
}