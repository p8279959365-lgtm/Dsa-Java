import java.util.*;
class sort0_1_2
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
        int j=n-1,temp=0,c=0;
        i=0;
        while(i<j)
        {
            if(arr[i]==0)
            {
                ++i;
            }
            else if(arr[j]!=0)
            {
                j--;
            }
            else if(arr[i]!=0 && arr[j]==0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(i=0;i<n;i++)
            if(arr[i]==0)
                ++c;
        i=c;
        j=n-1;
        while(i<j)
        {
            if(arr[i]==1)
            {
                ++i;
            }
            else if(arr[j]==2)
            {
                --j;
            }
            else if(arr[i]==2 && arr[j]==1)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}