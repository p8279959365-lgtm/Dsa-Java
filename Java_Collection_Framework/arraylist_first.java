import java.util.*;
class arraylist_first
{
    public static void main(String[] args)
    {
        ArrayList<Integer>li=new ArrayList<>();
        li.add(10);
        li.add(20);
        System.out.println(li);
        li.remove(0);
        System.out.println(li);
        ArrayList<Integer>li2=new ArrayList<>();
        li2.add(79);
        li2.add(70);
        li2.add(90);
        li.addAll(li2);
        System.out.println(li);
        li.removeAll(li2);
        li.add(29);
        li.add(39);
        System.out.println(li);
        System.out.println(li.size());
        Iterator<Integer>iterator=li.iterator();
        System.out.println(iterator);
        while(iterator.hasNext())
        {
            System.out.println(" Element: "+iterator.next());
        }
        li.add(3);
        System.out.println(li.get(3));
        li.set(3,45);
        System.out.println(li);
        Object arr[]=li.toArray();
        System.out.println(arr[0]);
        li.addAll(li2);
        System.out.println(li.containsAll(li2));
        Collections.sort(li);
        System.out.println(li);
        ArrayList<Integer>li3=new ArrayList<>();
        System.out.println(li3.isEmpty());
        li3.add(10);
        li3.add(20);
        System.out.println(li3);
        System.out.println(li3.indexOf(10));
        ArrayList<Integer>ll=(ArrayList<Integer>)li3.clone();
        li3.set(0,199);
        System.out.println(ll.get(0));



    }
}