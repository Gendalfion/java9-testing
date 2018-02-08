package org.aamvrosov.java9.common;

/**
 * Basic provider for all Java 9 examples.
 *
 * @author Aleksandr Amvrosov
 */
public interface Java9ExampleProvider extends Comparable<Java9ExampleProvider> {
    void runExample();

    default int order () {
        return lowestOrder();
    }

    @Override
    default int compareTo(Java9ExampleProvider o) {
        return Integer.compare(order(), o.order());
    }

    /**
     * Java 9 now allows private methods in the interfaces.
     */
    private static int lowestOrder() {
        return 9999;
    }
}
