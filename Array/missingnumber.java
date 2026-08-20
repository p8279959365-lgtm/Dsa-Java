import java.util.*;
class missingnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
         for(i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        int sum=(n*(n+1))/2;
        System.out.println("NUMBER MISSING: "+(sum-s));
    }
}