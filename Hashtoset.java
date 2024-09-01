package hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Hashtoset {
    public static void main(String args[])
    {
        HashMap<String,String>m=new HashMap<>();
        m.put("chennai","bengaluru");
        m.put("Mumbai","Delhi");
        m.put("Goa","Chennai");
        m.put("Delhi","Goa");
        HashSet<String>s=new HashSet<>();
        HashSet<String>d=new HashSet<>();
        for(HashMap.Entry<String,String>a:m.entrySet())
        {
            s.add(a.getKey());
            d.add(a.getValue());
        }
        Iterator<String> it = s.iterator();
        {
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        Iterator<String> it1 = d.iterator();
        {
            while(it1.hasNext())
            {
                System.out.println(it1.next());
            }

    }
}
