class p11
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4-i;j++)
            {
                System.out.print("  ");
            }
            for(k=0;k<4;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}