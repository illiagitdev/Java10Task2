package lessons.lesson6;

import java.util.ArrayList;

public class ArrayListExample {

    public static void print(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size();i++){
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        print(arrayList);

        arrayList.remove(2);
        print(arrayList);

        arrayList.add(2,-3);
        print(arrayList);
        arrayList.add(2,30);
        print(arrayList);

        arrayList.set(0, -5);
        print(arrayList);
    }
}
