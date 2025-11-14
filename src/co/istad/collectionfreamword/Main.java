package co.istad.collectionfreamword;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("HI");

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(345);


        System.out.println("Word: " + words);
        System.out.println("Num: " + nums);
    }
}