

import java.util.*;
class wave
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]=new int[row][col];
        int i,j;
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
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        j=0;
        for(i=0;i<col;i++)
        {
            if(j==0)
            {
                System.out.println();
                while(j<row)
                {
                    System.out.print(arr[j][i]+" ");
                    j++;
                }
                j=row-1;
            }

            else if(j==row-1)
            {
                System.out.println();
                while(j>=0)
                {
                    System.out.print(arr[j][i]+" ");
                    j--;
                }
                j=0;
            }

        }
    }
}