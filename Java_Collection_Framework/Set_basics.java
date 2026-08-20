import java.util.*;
class Set_basics
{
    public static void main(String[] args)
    {
        Map<String,String>m=new HashMap<>();
        m.put("in","India");
        m.put("br","Brazil");
        m.put("us","Unites States");
        m.put("pak","Pakistan");
        System.out.println(m);
        Map<String,String>m2=new HashMap<>();
        m2.putAll(m);
        m2.remove("in");
        int l=m2.size();
        System.out.println(l);
        System.out.println(m2);
        m2.clear();
        System.out.println(m2);
        System.out.println(m.getOrDefault("jk", "undia"));
        System.out.print(m.containsKey("in"));
        System.out.println(m);
        m.replace("in","Indonesia");
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

    }
}