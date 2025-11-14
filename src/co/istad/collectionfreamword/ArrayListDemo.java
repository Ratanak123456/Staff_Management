package co.istad.collectionfreamword;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(343);
        numbers.add(56);

        System.out.print("For array List: ");
        //Normal loop
        for (int i =0 ; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }

        //update array
        numbers.set(1, 250);
        numbers.add(2,200);
        numbers.addFirst(790);
        numbers.addLast(900);
        numbers.addLast(900);
        numbers.remove(1);
        numbers.removeIf(integer -> integer.equals(900));

        System.out.print("\nEnhanced for array list:");
        //Better one
        for (Integer number : numbers){
            System.out.print(" " + number);
        }
    }
}
