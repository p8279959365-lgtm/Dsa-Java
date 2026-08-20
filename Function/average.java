import java.util.*;
class average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter the number whose average have to be calculated ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        check_average(n1,n2,n3);
    }
    static void check_average(int n1,int n2,int n3)
    {
        double avg=(double)((n1+n2+n3)/3);
        System.out.println("Average is "+avg);
    }

}