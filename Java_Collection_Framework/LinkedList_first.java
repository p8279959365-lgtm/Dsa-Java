import java.util.*;
class LinkedList_first
{
    public static void main(String[] args)
    {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(10);
        ll.remove(3);
        System.out.println(ll);
        System.out.println(ll.lastIndexOf(10));
        ll.addFirst(18);
        ll.addLast(15);
        System.out.println(ll);
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);
        LinkedList<Integer>ll2=new LinkedList<>();
        ll2.add(10);
        ll2.addFirst(190);
        ll2.addLast(45);
        System.out.println(ll2);
        ll.addAll(ll2);
        System.out.println(ll);
        System.out.println(ll.poll()+" \n"+ll);


    }
}