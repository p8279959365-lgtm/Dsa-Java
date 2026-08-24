import java.util.*;
class rotateby90
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int i,j;
        int arr[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The orignal matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // for rotation we have to first transpose -----> reverse row

        int temp;

        // transpose
        for(i=0;i<row;i++)
        {
            for(j=i+1;j<col;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("The transposed array: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




        for(int z=0;z<row;z++)
        {
            int start=0;
            int end=col-1;
            while(start<end)
            {
                temp=arr[z][start];
                arr[z][start]=arr[z][end];
                arr[z][end]=temp;
                start++;
                end--;
            }
        }

        System.out.println("We have succesfully rotated ");

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