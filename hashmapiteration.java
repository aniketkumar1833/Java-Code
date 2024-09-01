package hashmap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
class abc{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("enter a value=");
        int a=s.nextInt();
        for(int i=1;i<=a;i++)
        {
            System.out.println("enter si number=");
            int b=s.nextInt();
            s.nextLine();
            System.out.println("enter value");
            String c=s.nextLine();
            map.put(b,c);
        }
        for(Map.Entry<Integer,String>obj:map.entrySet())
        {
            System.out.println(obj.getKey());
        }
    }
}
