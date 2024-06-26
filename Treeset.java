import java.util.*;

public class Treeset{

    public static void main(String[] args){

        Set<String> hashSet = new HashSet<>();  
        Set<String> linkedHashset = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
            
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        linkedHashset.add("Apple");
        linkedHashset.add("Banana");
        linkedHashset.add("Orange");

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        System.out.println(hashSet);
        System.out.println(linkedHashset);
        System.out.println(treeSet);
    
    }
}