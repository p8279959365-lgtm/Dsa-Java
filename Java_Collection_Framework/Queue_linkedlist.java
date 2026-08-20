import java.util.*;
class Queue_linkedlist
{
    public static void main(String[] args)
    {
        Queue<Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.offer(20);
        System.out.println(ll);
        System.out.println(ll.poll()+" Queue is: "+ll);
        ll.offer(90);
        System.out.println(ll); 
    }
}