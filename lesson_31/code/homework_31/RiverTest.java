package homework_31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River[] rivers;

    @BeforeEach
    void setUp() {
        rivers = new River[5];

        rivers[0] = new River("Nile", 6650, 10.2);
        rivers[1] = new River("Amazon", 6400, 20.0);
        rivers[2] = new River("Yangtze", 6300, 16.5);
        rivers[3] = new River("Mississippi", 3778, 12.8);
        rivers[4] = new River("Danube", 2850, 8.5);
    }

    public void printRiversTest(Object[] array, String title){

        System.out.println("----------" + title + "-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    @Test
    void testComparable(){
        printRiversTest(rivers, "List of rivers");
        Arrays.sort(rivers);
        printRiversTest(rivers, "Last of river sorted by name");
        River pattern = new River("Mississippi", 0, 0);
        int index = Arrays.binarySearch(rivers, pattern);
        System.out.println(index);
    }

    @Test
    void comparatorByLength(){
        Comparator<River> comparatorByLength = new Comparator<River>() {
            @Override
            public int compare(River o1, River o2) {
                return Double.compare(o1.getLength(), o2.getLength());
            }
        };
        printRiversTest(rivers, "List of rivers");
        Arrays.sort(rivers, comparatorByLength);
        printRiversTest(rivers, "Last of river sorted by legth");
        River pattern = new River(null, 300, 0);
        int index = Arrays.binarySearch(rivers, pattern, comparatorByLength);
        if (index >0){
            System.out.println("Found index " + index + " this is a river with length " + pattern.getLength() );
        }else {
            System.out.println("River" + pattern.getLength() + "did not found? but it could be on index " +(-index-1) );
        }
        System.out.println(index);
    }

    @Test
    void comparatorByDepth(){
        Comparator<River> comparatorByDepth = new Comparator<River>() {
            @Override
            public int compare(River o1, River o2) {
                return Double.compare(o1.getDepth(), o2.getDepth());
            }
        };
        printRiversTest(rivers, "List of rivers");
        Arrays.sort(rivers, comparatorByDepth);
        printRiversTest(rivers, "Last of river sorted by depth");
        River pattern = new River(null, 0, 20.0);
        int index = Arrays.binarySearch(rivers, pattern, comparatorByDepth);
        if (index >0){
            System.out.println("Found index " + index + " this is a river with depth " + pattern.getDepth());
        }else {
            System.out.println("River" + pattern.getDepth() + "did not found? but it could be on index " +(-index-1) );
        }
        System.out.println(index);
    }

    @Test
    void testArrayCopy(){
        River[] riversCopy = Arrays.copyOf(rivers, rivers.length * 2);
        printRiversTest(riversCopy, "List of rivers");
        System.out.println(riversCopy.length);
        Comparator<River> comparatorByLength = Comparator.nullsLast((r1, r2) ->Double.compare(r1.getLength(), r2.getLength()));
        Arrays.sort(riversCopy, comparatorByLength);
        printRiversTest(riversCopy, "rivers copy after sorting by length");
        River pattern = new River(null, 7676, 0);
        int  index = Arrays.binarySearch(riversCopy, 0, rivers.length, pattern, comparatorByLength);
        System.out.println(index);
    }

@Test
    void testInsertKeepSorting(){
        Arrays.sort(rivers);
        printRiversTest(rivers,"List of rivers");
        River[] riversCopy = Arrays.copyOf(rivers, rivers.length +1);
        River river = new River("Dnipro", 2201, 20);
        int index = Arrays.binarySearch(riversCopy, 0, riversCopy.length -1, river);
        index = index >=0 ? index: -index-1;
        System.arraycopy(riversCopy, index, riversCopy, index+1, riversCopy.length -index -1);
        riversCopy[index] = river;
        rivers = riversCopy;
        printRiversTest(rivers, "List with added river");
}



}