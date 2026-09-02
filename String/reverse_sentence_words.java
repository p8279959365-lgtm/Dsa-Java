



import java.util.*;
class reverse_sentence_words
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the string to be reversed");
        String s=sc.nextLine();
        s.trim();
        String arr[]=s.split(" ");
        int i;
        for(i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}