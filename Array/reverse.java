import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array ");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int temp,c=0,l=n-1;
        while(c<n/2)
        {
            temp=arr[l];
            arr[l]=arr[c];
            arr[c]=temp;
            c++;
            l--;
        }
        System.out.println(" REVERSE ARRAY IS: ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}