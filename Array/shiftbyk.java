import java.util.*;
class shiftbyk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no of pos to be shifted");
        int shift=sc.nextInt();
        int temp;
        for(j=0;j<shift;j++)
        {
            temp=arr[n-1];
            for(i=n-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        System.out.println("THE FINAL ARRAY AFTER SHIFTING IS: ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" "); 
        }
    }
}