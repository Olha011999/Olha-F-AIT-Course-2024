package homework_40.treeset;

import java.util.Set;
import java.util.TreeSet;

public class StructureTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(10);
        treeSet.add(5);
        System.out.println("TreeSet numbers: " + treeSet);

        System.out.println("Size of TreeSet: " + treeSet.size());

        System.out.println("Contains 10: " + treeSet.contains(10));
        System.out.println("Contains 25: " + treeSet.contains(25));

        treeSet.remove(3);
        System.out.println("Remove 3: " +treeSet);
        System.out.println("Remove 3: " + treeSet.remove(3));

        System.out.println("Is TreeSet empty: " + treeSet.isEmpty());

        System.out.println("Head set (less than 10): " + treeSet.headSet(10));
        System.out.println("Tail set (greater than or equal to 10): " + treeSet.tailSet(10));
        System.out.println("Sub set (from 2 to 10): " + treeSet.subSet(2, 10));

        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

       treeSet.clear();
       System.out.println("TreeSet after clear: " + treeSet);







    }
}
