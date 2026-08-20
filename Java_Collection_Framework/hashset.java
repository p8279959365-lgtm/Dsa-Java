import java.util.*;
class hashset
{
    public static void main(String[] args)
    {
        Set<Integer>s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);
        Set<Integer>s2=new HashSet<>();
        s2.add(30);
        s2.add(23);
        s2.add(30);
        s2.add(40);
        s2.add(50);
        System.out.println(s2);
        s.retainAll(s2);
        System.out.println(s);
        System.out.println(s.containsAll(s2));
        System.out.println(s2.containsAll(s));
    }
}