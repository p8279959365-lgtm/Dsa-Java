import java.util.*;
class transposeSingleArray
{
    public static void main(String[]agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int i,j;
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of the array");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("the orignal matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int temp;
        for(i=1;i<row;i++)
        {
            for(j=i+1;j<col;j++)
            {

                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("Transpose matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}