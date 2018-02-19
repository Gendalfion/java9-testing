package org.aamvrosov.java9.process.api.improvements;

import org.aamvrosov.java9.common.Java9ExampleProvider;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Java9ProcessImprovementsPresentation implements Java9ExampleProvider {
    @Override
    public void runExample() {
        final String processInfoString = ProcessHandle.current().info().toString();
        System.out.println("Current process information:");
        System.out.println(stream(processInfoString.split(",")).collect(joining("\n")));
    }

    @Override
    public int order() {
        return 1;
    }
}
