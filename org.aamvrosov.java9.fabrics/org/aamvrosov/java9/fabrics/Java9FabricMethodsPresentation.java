package org.aamvrosov.java9.fabrics;

import org.aamvrosov.java9.common.Java9ExampleProvider;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9FabricMethodsPresentation implements Java9ExampleProvider {
    @Override
    public void runExample() {
        System.out.println("*** Java 9 Fabric Methods Presentation ***");
        System.out.println("  List.of - " + List.of(1, 2, 3L));
        System.out.println("  Set.of - " + Set.of(1, 1L, 4d));
        System.out.println("  Map.of - " + Map.of("first-key", 1L, "second-key", -1));
    }
}
