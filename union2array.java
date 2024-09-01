package hashmap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class union2array {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c[]=new int[a];
        int d[]=new int[b];
        System.out.println("enter values in 1st array");
        for(int i=0;i<a;i++)
        {
            c[i]=s.nextInt();
        }
        System.out.println("enter values in 2nd array");
        for(int j=0;j<b;j++)
        {
            d[j]=s.nextInt();
        }
        HashSet<Integer>m=new HashSet<>();
        for(int i=0;i<c.length;i++)
        {
            m.add(c[i]);
        }
        for(int j=0;j<d.length;j++)
        {
            m.add(d[j]);
        }
        Iterator<Integer> it=m.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+",");
        }

    }
}
