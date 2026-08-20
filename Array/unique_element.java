import java.util.*;
class unique_element
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
        for(Integer j:frequency.keySet())
        {
          int freq=frequency.get(j);
          if(freq==1)
          {
            System.out.println("UNIQUE ELEMENT IS: "+j);
            break;
          }

        }
    }
}