package main.task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array {

    public static void main(String[] args) {
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};

        String collect = Arrays.stream(numbers)
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(collect);
    }
}




