


import java.util.*;
class missingElementsInArrayWithDuplicates
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in arry");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(i=0;i<n;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        TreeMap<Integer,Integer>sort=new TreeMap<>(freq);
        int c=1;
        for(int j:sort.keySet())
        {
            if(c==j)
                ++c;
            else
            {
                System.out.println("Missing value is "+c);
                break;
            }
        }
        if(c==n-1)
        while(c<=n)
        {
            System.out.println("Missing value is "+n);
            c++;
        }

    }
}