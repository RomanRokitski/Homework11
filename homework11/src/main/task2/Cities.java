package main.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Cities {
    public static void main(String[] args) {
        List<String> capitals = Stream.of("Washington", "London", "Kyiv", "Paris")
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}