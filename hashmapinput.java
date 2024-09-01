package hashmap;

import java.util.HashMap;
import java.util.Scanner;
public class hashmapinput {
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        s.nextLine();
        for(int i=1;i<=a;i++)
        {
            System.out.println("enter key value=");
            int f=s.nextInt();
            s.nextLine();
            System.out.println("enter value=");
            String v=s.nextLine();
            map.put(f,v);
            System.out.println(f+f);

        }
        System.out.print(map);
    }
    
}
