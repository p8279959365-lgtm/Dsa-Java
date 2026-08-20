import java.util.*;
class arrayinalternate
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
        i=0;
        int j=n-1;
        while(i<=j)
        {
            if(i==j)
            {
                System.out.print(arr[i]);
            break;
            }
            else
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[j]+" ");
                i++;
                j--;
            }
        }
    }
}