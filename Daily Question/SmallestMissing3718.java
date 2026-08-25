



import java.util.*;
class SmallestMissing3718
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number of elements to be in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashSet<Integer>hs=new HashSet<>();
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }

        System.out.println("Enter the number whose mu;tiple have to be checked");
        int k=sc.nextInt();
        
        int num=1;
        while(true)
        {
            int res=num*k;
            num++;
            if(hs.contains(res)==false)
            {
                System.out.println("the smallest missing multiple is: "+res);
                break;
            }
        }


    }
}