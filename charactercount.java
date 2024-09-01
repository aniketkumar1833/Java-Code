package hashmap;

import java.util.HashMap;

public class charactercount {
    public static void main(String args[])
    {
        
        char a[]={'a','b','b','d','c','a'};
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:a)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(HashMap.Entry<Character,Integer>m:map.entrySet())
        {
            System.out.println(m.getKey()+"="+m.getValue());
        }
        
    }
}
