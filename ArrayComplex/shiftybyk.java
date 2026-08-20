import java.util.*;
class shiftybyk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no of right shift to be done");
        int shift=sc.nextInt();
        shift=shift%n;
        int temp=0,temp2=shift;
        for(i=0;i<shift;i++)
        {
            temp=arr[i];
            arr[i]=arr[i+temp2-1];
            arr[i+temp2-1]=temp;
            temp2--;
        }
        for(int z:arr)
        System.out.println(z);

    }
}