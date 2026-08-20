// unique element is the element which occurs only once in the array

// we will be using the concept of xor as in xor same elements cancle each other so 
// we will xor array elements with themselves so the repeating elements will cancle out and the element with single (odd occurance) will remain




import java.util.*;
class unique_element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tyhe number of elements in the aray");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int xorsum=0;
        for(i=0;i<n;i++)
        {
            xorsum=xorsum^arr[i];
        }
        System.out.println("unique element is "+xorsum);
    }
}