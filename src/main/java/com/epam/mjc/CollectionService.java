package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public static List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public static List<String> toUpperCaseCollection(List<String> list) {

        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public static Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public  Optional<Integer> findMin(List<List<Integer>> list) {
       // return list.stream().flatMap(list - > list.stream().min(Integer::compare));

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public static Integer sum(List<Integer> list) {
       return list.stream().reduce((n,e) -> n + e).get();
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(6);
        System.out.println(filterEvenNumbers(integers));
        System.out.println(findMax(integers));
        System.out.println(sum(integers));
        List<String> strings = new ArrayList<>();
        strings.add("asdasd");
        strings.add("asdsasd");
        strings.add("asddasd");
        strings.add("asdasfd");
        System.out.println(toUpperCaseCollection(strings));
    }
}
