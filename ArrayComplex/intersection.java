import java.util.*;
class intersection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        System.out.println("Enter the ements in array 1");
        int i;
        for(i=0;i<10;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements in array2");
        for(i=0;i<10;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int j;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(arr2[j]==arr1[i])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}