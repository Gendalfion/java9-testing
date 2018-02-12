package org.aamvrosov.java9.optional;

import org.aamvrosov.java9.common.Java9ExampleProvider;

import java.util.Optional;
import java.util.stream.Stream;

public class Java9OptionalPresentation implements Java9ExampleProvider {
    @Override
    public void runExample() {
        System.out.println("*** Optional.stream()");
        System.out.println("Having stream of optionals: ");
        Stream.of(
                Optional.of(1),
                Optional.of(2),
                Optional.of(3),
                Optional.of(4))
                .peek(System.out::println)
                .flatMap(Optional::stream)
                .forEach(val -> System.out.println(val + 1));
        System.out.println();

        System.out.println("*** Optional.ifPresentOrElse()");
        final Optional<String> notEmptyOptional = Optional.of("some real value");
        notEmptyOptional.ifPresentOrElse(
                val -> System.out.println("ifPresentValueAction: value = " + val),
                () -> System.out.println("orElseAction"));
        System.out.println();

        System.out.println("*** Optional.or()");
        final Optional<Long> longValueOptional = Optional.of(1L);
        longValueOptional.or(() -> Optional.of(3L))
                .ifPresent(longValue -> System.out.println("1L.or(3L) = " + longValue));

        final Optional<String> emptyValueOptional = Optional.empty();
        emptyValueOptional.or(() -> Optional.of("not empty"))
                .ifPresent(value -> System.out.println("empty.or(\"not empty\") = " + value));

        final boolean emptyOrEmptyIsPresent = emptyValueOptional.or(Optional::empty).isPresent();
        System.out.println("empty.or(\"empty\").isPresent = " + emptyOrEmptyIsPresent);
    }

    @Override
    public int order() {
        return 3;
    }
}
