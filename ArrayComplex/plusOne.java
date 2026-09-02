import java.util.*;
class plusOne
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits to be entered in the array");
        int n=sc.nextInt();
        System.out.println("Enter the integer in form of array");
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=increaseByOne(arr);
        for(i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] increaseByOne(int arr[])
    {

        int i;
        int len;
        len=arr.length;
        for(i=len-1;i>=0;i--)
        {
            if(arr[i]!=9)
            {
                arr[i]++;
                return arr;
            }
            else
            {
                arr[i]=0;
            }
        }

        /* ie all are 9 so we have to do it 10 or 99 to 100 */

        int newArr[]=new int[len+1];
        newArr[0]=1;
        return newArr;

    }
}