package main.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Roman", "Inna", "Sergey");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(first, second);

        result
                .peek(it -> System.out.print(it + " "))
                .collect(Collectors.toList());

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorB.next());
            resultList.add(iteratorA.next());
        }

        return resultList.stream();

    }
}
