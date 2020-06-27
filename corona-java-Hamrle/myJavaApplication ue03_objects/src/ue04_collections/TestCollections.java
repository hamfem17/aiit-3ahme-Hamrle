package ue04_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class TestCollections<E>
{
    private E value;

    public TestCollections(E value)
    {
        this.value = value;
    }
    
    public TestCollections()
    {
        double x1 = 3.14;
        Double x2 = 3.14;
        Double x3 = 3.14;
        System.out.println("1.) x1 == x2 => " + (x1 == x2));
        System.out.println("2.) x2 == x3 => " + (x2 == x3));
        System.out.println("3.) x2.equals(x3) => " + (x2.equals(x3)));
        System.out.println("--------------------------------------");
        
        String s1 = "Hallo";
        String s2 = "Hallo"; //new String("Hallo");
        System.out.println("4.) s1 == s2 => " + (s1 == s2));
        System.out.println("5.) s1.equals(s2) => " + (s1.equals(s2)));
        System.out.println("--------------------------------------");
        
        ArrayList l1 = new ArrayList();
        System.out.println("6.) l1.size() => " +l1.size());
        l1.add(x1);
        l1.add(x2);
        l1.add(s1);
        System.out.println("7.) " +l1);
        System.out.println("8.) l1.size() => " +l1.size());
        l1.remove(1);
        System.out.println("9.) " +l1);
        System.out.println("--------------------------------------");
        
        ArrayList l2 = (ArrayList)l1.clone();
        System.out.println("10.) " +l2);
        System.out.println("11.) l1 == l2 => " + (l1 == l2));
        System.out.println("12.) l1.hashCode() == l2.hashCode() => " + (l1.hashCode() == l2.hashCode()));
        System.out.println("13.) System.identityHashCode(l1) == System.identityHashCode(l2) => " + (System.identityHashCode(l1) == System.identityHashCode(l2)) );
        
        ArrayList<Double> l3 = new ArrayList<>();
        l3.add(2.0);
        l3.add(x1);
        l3.add(10.0);
        
        ArrayList l4 = l3;
        l4.add("Hallo");
        System.out.println("14.) "+l3);
    }
    
    public static void main(String[] args)
    {
        new TestCollections<String>("");
    }
}
