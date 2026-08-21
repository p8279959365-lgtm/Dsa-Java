import java.util.*;
class threesumEasy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        List<List<Integer>>result=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int left,right;
        Arrays.sort(arr);
        for(i=0;i<n-2;i++)
        {
            if(arr[i]==arr[i+1]){
                continue;
            }
            left=i+1;
            right=arr.length-1;

            while(left<right)
            {
                if(arr[i]+arr[left]+arr[right]==target)
                {
                    List<Integer>li=new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[left]);
                    li.add(arr[right]);
                    result.add(li);
                    left++;
                    right--;
                }
                while(left<right && arr[left]==arr[left+1])
                {
                    left++;
                }
                while(left<right && arr[right]==arr[right-1])
                {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}