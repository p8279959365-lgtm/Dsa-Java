import java.util.*;
class SumOfRow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        ArrayList<Integer>result=new ArrayList<>();
        int i,j;
        int sum=0;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

         for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum=sum+arr[i][j];
            }
            result.add(sum);
            sum=0;
        }

        System.out.println("Sum of each row is "+result);

    }
}