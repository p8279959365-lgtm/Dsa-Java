import java.util.*;
class shiftby1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        
        int arr []=new int[n];
        int i,temp;
        
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        temp=arr[n-1];
        for(i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("Shifted array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}