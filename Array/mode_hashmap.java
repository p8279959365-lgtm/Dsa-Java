// import java.util.*;
// class mode_hashmap
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int i,num;
//         for(i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         HashMap<Integer,Integer>freq=new HashMap<>();
//         for(i=0;i<n;i++)
//         {
//             freq.put(arr[i],freq.getOrDefault(arr[i],0));
//         }
//         for(i: freq.keySet())
//         {
//             System.out.println(i+"->"+freq.get(i));
//         }
//     }
// }