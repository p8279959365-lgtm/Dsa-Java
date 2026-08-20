import java.util.*;
class removeDuplicatesinSorted
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        System.out.println("Enter the elements ");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=1;
        i=0;
        while(j<10)
        {
            if(arr[i]==arr[j])
            {
                j++;
            }
            else{
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }
        for(j=0;j<=i;j++)
        {
            System.out.print(arr[j]+ "  ");
        }
    }
}