package lessons.lesson6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);

        Iterator<Integer> integerIterator = hashSet.iterator();

        while (integerIterator.hasNext()){
            Integer x = integerIterator.next();
            System.out.println(x);
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        //HashSet<Integer> hashSet1 = new HashSet<Integer>(comparator );

    }
}
