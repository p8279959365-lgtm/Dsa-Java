

import java.util.*;
class transpose
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int i,j;
        int copy[][]=new int[col][row];
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
                copy[j][i]=arr[i][j];
            }
        }


        System.out.println("Orignal :");
           for(i=0;i<row;i++)
            {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
             }


             System.out.println("Transpose matrix:");
           for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                System.out.print(copy[i][j]+" ");
                
            }
            System.out.println();
        }



    }
}