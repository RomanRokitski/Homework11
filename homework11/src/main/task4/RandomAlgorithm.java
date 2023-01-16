package main.task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgorithm {
//    private long a, c, m;
//
//    public RandomAlgorithm(long a, long c, long m) {
//        this.a = a;
//        this.c = c;
//        this.m = m;
//    }
public static void main(String[] args) {
    RandomAlgorithm r = new RandomAlgorithm();

    r.getRandom(25214903917L, 11, 2 ^ 48L)
            .limit(10)
            .peek(System.out::println)
            .collect(Collectors.toList());
}
    public Stream<Long> getRandom(long a, long c, long m) {

        return Stream.iterate(0L, x -> (a * x + c) % m);

    }

}
