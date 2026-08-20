import java.util.*;
class missing_and_duplicate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=(n*(n+1))/2;
        HashMap<Integer,Integer>frequency=new HashMap<>();
        for(i=0;i<n;i++)
        {
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        i=0;
        for(Integer j:frequency.keySet())
        {
            arr[i]=j;
            i++;
        }
        n=i;
        int s=0;
        for(i=0;i<n;i++)
        {
            s+=arr[i];
        }
        System.out.println("MISSING ELEMENT: "+(sum-s));
    }
}