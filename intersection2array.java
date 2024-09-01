package hashmap;
import java.util.HashSet;
import java.util.Scanner;
public class intersection2array {
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
        for(int i=0;i<b;i++)
        {
            m.add(d[i]);
        }
        for(int i=0;i<a;i++)
        {
            if(m.contains(c[i]))
            {
                System.out.println(c[i]);
            }
        }
    }
}
