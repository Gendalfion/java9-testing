package org.aamvrosov.main;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo project, running on Java " + System.getProperty("java.version"));

        System.out.println();
        System.out.println("List.of - " + List.of(1, 2, 3L));
        System.out.println("Map.of - " + Map.of("first-key", 1L, "second-key", -1));
    }
}
