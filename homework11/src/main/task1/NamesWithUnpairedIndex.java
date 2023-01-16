package main.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesWithUnpairedIndex {

    public static void main(String[] args) {
        List<Names> students = Arrays.asList(
                new Names("Alex", 1),
                new Names("Rika", 2),
                new Names("Julia", 3),
                new Names("Steve", 4)
        );

        students.stream()
                .filter(NamesWithUnpairedIndex::getNameIndex)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    private static boolean getNameIndex(Names number) {
        return (number.getNumber() % 2) != 0;
    }

}
