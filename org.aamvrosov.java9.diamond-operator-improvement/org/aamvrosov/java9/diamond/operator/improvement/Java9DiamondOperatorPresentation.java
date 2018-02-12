package org.aamvrosov.java9.diamond.operator.improvement;

import org.aamvrosov.java9.common.Java9ExampleProvider;

public class Java9DiamondOperatorPresentation implements Java9ExampleProvider {


    @Override
    public void runExample() {
        System.out.println("Java 9 allows diamond operator for anonymous classes:");

        new AbstractHandler<>(10) {
            @Override
            public void process() {
                System.out.println(String.format("Handler: new AbstractHandler<>(10), class of T=%s, value=%d",
                        getValue().getClass().getSimpleName(),
                        getValue()));
            }
        }.process();
    }

    @Override
    public int order() {
        return 2;
    }

    private static abstract class AbstractHandler<T> {
        private final T value;

        private AbstractHandler(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public abstract void process();
    }
}
