import java.util.*;
class p5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and number of columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(j==0||j==(c-1)||i==0||i==(r-1))
                    System.out.print(" * ");
                else
                    System.out.print("   r");
            }
            System.out.println();
        }
    }
}