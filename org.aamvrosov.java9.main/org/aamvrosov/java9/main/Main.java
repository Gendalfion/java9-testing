package org.aamvrosov.java9.main;

import org.aamvrosov.java9.common.Java9ExampleProvider;

import java.util.ServiceLoader;

/**
 * Project main entry point.
 *
 * @author Aleksandr Amvrosov
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** Java 9 features testing pet-project ***");

        // dynamic load of specified type providers
        ServiceLoader.load(Java9ExampleProvider.class).stream()
                .map(ServiceLoader.Provider::get)
                .sorted()
                .forEach(provider -> {
            System.out.println();
            System.out.println("--- Java9ExampleProvider " + provider.order() + ": " + provider.getClass().getName());
            provider.runExample();
        });
    }
}
