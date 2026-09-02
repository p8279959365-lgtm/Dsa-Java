/* we will be using 2 variable one will store the majority element and the second one will count the frequency of the majority element i_f we will be getting some other element than the majority element we will decrease the freq of majaority element  and we will then check that is frequency is zero ifthats so then the majority element= element*/

import java.util.*;
class majority_Element_WithoutHashMap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int freq=0,majority=0,i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            if(freq==0)
            {
                majority=arr[i];
            }
            if(arr[i]==majority)
                ++freq;
            else
                --freq;
        }
        System.out.println("MAjority element is: "+majority);
    }
}