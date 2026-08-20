import java.util.*;
class removedupicates{
    public static int removeDuplicates(int[] nums)
    {
      HashMap<Integer,Integer>freq=new HashMap<>();
      int i;
      for(i=0;i<nums.length;i++)
      {
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
      }  
      for(Integer j:freq.keySet())
      {
        System.out.print(j+" ");
      }
      return 0;
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,45,10,20};
        removeDuplicates(arr);
    }
}