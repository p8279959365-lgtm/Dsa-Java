class p4
{
    public static void main(String[] args)
    {
        int i,j;
        int c=65;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)c+" ");
                c++;
            }
            System.out.println();
        }
    }
}