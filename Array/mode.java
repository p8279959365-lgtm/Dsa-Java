import java.util.*;
class mode
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>frequency=new HashMap<>();
        for(i=0;i<n;i++)
        {
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
       int max=0,maxkey=0,min=n,minkey=0;
        for(Integer j:frequency.keySet())
        {
            if(frequency.get(j)>max)
            {
                max=frequency.get(j);
                maxkey=j;
            }
            if(frequency.get(j)<min)
            {
                min=frequency.get(j);
                minkey=j;
            }
        }
        System.out.println("MAXIMUM: "+maxkey+" FREQUENCY: "+max);
        System.out.println("MINIMUM: "+minkey+" FREQUENCY: "+min);
    }
}