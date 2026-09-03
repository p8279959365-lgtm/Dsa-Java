





import java.util.*;
class UniformParityArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int c=0;
        if(min%2!=0)
        {
            System.out.println("Possibe");
        }
        
        else{
            for(i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                    ++c;
            }
            if(c==n)
                System.out.println("Possible");
            else
                System.out.println("Not possible");

        }
    }
}