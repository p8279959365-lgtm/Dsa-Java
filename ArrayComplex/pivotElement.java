


import java.util.*;
class pivotElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        int lr[]=new int[n];
        int rl[]=new int[n];
        System.out.println("enter the elments of the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
            lr[i]=sum;
        }
        sum=0;
        for(i=n-1;i>=0;i--)
        {
            sum=sum+arr[i];
            rl[i]=sum;
        }
        int c=0;
        for(i=0;i<n;i++)
        {
            if(lr[i]==rl[i])
            {
                ++c;
                System.out.println("Pivot element is: "+arr[i]+" index: "+i
                    
                );
            }
        }
        if(c==0)
        System.out.println("No pivot element");
    }
}