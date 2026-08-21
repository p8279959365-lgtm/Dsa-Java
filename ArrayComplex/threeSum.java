import java.util.*;
class threeSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,k;
        System.out.println("Enter the elements in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target=sc.nextInt();
        List<List<Integer>>result=new ArrayList<>();
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        List<Integer> li=new ArrayList<>();
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[k]);
                        Collections.sort(li);
                        result.add(li);
                    }
                }
            }
        }
        System.out.println(result);
    }
}