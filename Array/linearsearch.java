import java.util.*;
class linearsearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println("Enter tye elements of the array ");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the target element ");
        int target=sc.nextInt();
        int c=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                ++c;
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        if(c==0)
            System.out.println("Element not found ");
    }
}