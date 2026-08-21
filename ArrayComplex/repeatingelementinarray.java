import java.util.*;
class repeatingelementinarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>freq=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }


        for(i=0;i<n;i++)
        {
            if(freq.get(arr[i])>1)
            {
                System.out.print("Repeating element is: "+arr[i]);
                break;
            }
        }
    }
}