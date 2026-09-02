/* we have to make a new array such that all elements are even or all are odd i the second array using the elements of the first array      

if elements initially in array1 are all odd or all even then do nothing return the new array as it is

even-even =even;


even-odd=odd


we will take all even and convert it into odd array by sunbtyracting from any odd element */





import java.util.*;
class single_parity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the initial array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int odd[]=new int[n];
        int i,j,c=0,c1=0,temp=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                ++c;
            }
            else
            {
                temp=arr[i];
                odd[i]=1;
                ++c1;
            }
        }
        if(c==n || c1==n)
        {
            System.out.println("True");
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(odd[i]==1)
                {
                    arr2[i]=arr[i];
                }
                else
                {
                    arr2[i]=arr[i]-temp;
                }
            }
            System.out.println("done");
            for(i=0;i<n;i++)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}