package hashmap;
import java.util.HashMap;
class z
{
    public static void main(String args[])
    {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india",120);
        map.put("china",12);
        map.put("nepal",20);
        System.out.println(map);
        System.out.println(map.containsKey("nepal"));
        System.out.println(map.remove("nepal",20));
        System.out.println(map);
    }
}