package org.aamvrosov.java9.stream.api.improvements;

import org.aamvrosov.java9.common.Java9ExampleProvider;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9StreamImprovementsPresentation implements Java9ExampleProvider {
    @Override
    public void runExample() {
        System.out.println("Java 9 now has Stream.iterate(), Stream.dropWhile(), Stream.takeWhile():");
        System.out.println("Stream.iterate(1, i -> i < 50, i -> i + 3)\n" +
                "                .dropWhile(i -> i < 10)\n" +
                "                .takeWhile(i -> i < 30)\n" +
                "                .map(String::valueOf)\n" +
                "                .collect(Collectors.joining(\" \")):\n" +
                Stream.iterate(1, i -> i < 50, i -> i + 3)
                        .dropWhile(i -> i < 10)
                        .takeWhile(i -> i < 30)
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));

        System.out.println();
        System.out.println("And Stream.ofNullable():");
        System.out.println("Stream.ofNullable(\"not null value\").reduce(String::concat) = " +
                Stream.ofNullable("not null value").reduce(String::concat));
        System.out.println("Stream.ofNullable(null).count() = " + Stream.ofNullable(null).count());
    }

    @Override
    public int order() {
        return 4;
    }
}
