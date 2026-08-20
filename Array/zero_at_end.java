import java.util.*;
class zero_at_end
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        i=0;
        j=n-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
            if(arr[i]==0)
                i++;
            if(arr[j]==1)
                j--;
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}