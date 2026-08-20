import java.util.*;
class twosum_using_2pointer
{
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
            int arr[]={10,23,5,15,2,90,7,1};
            int i,j,temp;
            int target;
            System.out.println("target element");
            target=sc.nextInt();
            for(i=0;i<arr.length;i++)
            {
                for(j=i+1;j<arr.length;j++)
                {
                    if(arr[j]<arr[i])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            i=0;
            int c=0;
            j=arr.length-1;
            int sum;
            while(i<j)
            {
                sum=arr[i]+arr[j];
                if(sum>target)
                    j--;
                if(sum<target)
                    i++;
                else if(sum==target)
                {
                    System.out.println(arr[i]+ " "+arr[j]);
                    ++c;
                    break;}
            }
            if(c==0)
                System.out.println("2 sum not possible");
    }
}