class imp_pattern
{
    public static void main(String[] args)
    {
        int i,j,k,l;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5-i;j++)
            {
                System.out.print("  ");
            }
            for(k=i+1;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(j=2;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}