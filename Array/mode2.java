import java.util.*;
class mode2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        System.out.println("Enter the elements in the array");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(i=0;i<10;i++)
        {
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
       int max=0;
       int min=10;
       int max_key=0,min_key=0;
       int current_key,current_key_frequency;
        for(Integer j: frequency.keySet())
        {
           current_key=j;
           current_key_frequency=frequency.get(j);

           if(current_key_frequency>max)
           {
            max=current_key_frequency;
            max_key=current_key;
           }

           if(current_key_frequency<min)
           {
            min=current_key_frequency;
            min_key=current_key;
           }
        }


        System.out.println("Max element "+max_key+" frequency: "+max);
        System.out.println("Minimum element:"+min_key+" frequency: "+min);
    }
}