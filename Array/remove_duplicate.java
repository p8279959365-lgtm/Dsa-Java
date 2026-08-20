import java.util.*;
class remove_duplicate
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
        int j=1;
        int temp;
        while(j<n)
        {
            if(arr[i]==arr[j])
            {
                j++;
            }
            else
            {
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }
        n=i+1;
        System.out.println("removed the duplicates successfully");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}