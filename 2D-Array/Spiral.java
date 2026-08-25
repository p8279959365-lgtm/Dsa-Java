


import java.util.*;
class Spiral
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
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


        int startingrow=0;
        int endingrow=row-1;
        int startingcol=0;
        int endingcol=col-1;
        }
    }
}