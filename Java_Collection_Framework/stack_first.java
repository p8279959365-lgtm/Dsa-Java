import java.util.*;
class stack_first
{
    public static void main(String[] args)
    {
        Stack<Integer>st=new Stack<>();
        st.add(10);
        System.out.println(st);
        st.addFirst(10);
        st.addLast(30);
        st.addFirst(20);
        st.removeFirst();
        System.out.println(st);
        st.addFirst(20);
        st.push(90);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.search(20));
    }
}