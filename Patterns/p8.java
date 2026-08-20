class p8
{
    public static void main(String[] args)
    {
        int i,j;
        int c=1;
        for(i=0;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}