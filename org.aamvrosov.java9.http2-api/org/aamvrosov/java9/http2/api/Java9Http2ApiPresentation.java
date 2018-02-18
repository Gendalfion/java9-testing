package org.aamvrosov.java9.http2.api;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import org.aamvrosov.java9.common.Java9ExampleProvider;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

import static java.lang.System.out;

public class Java9Http2ApiPresentation implements Java9ExampleProvider {
    @Override
    public void runExample() {
        try {
            final HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.SECURE)
                    .build();
            out.println("New HttpClient in Java 9 is created with modern builder pattern:");
            out.println("httpClient = HttpClient.newBuilder().<...>.build()");
            out.println("httpClient.version() = " + httpClient.version());

            final HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://www.google.com/"))
                    .GET()
                    .build();

            out.println();
            out.println("We can send asynchronous requests with httpClient.sendAsync(...).");
            out.println("Lets make GET request to Google asynchronously:");
            final CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture =
                    httpClient.sendAsync(httpRequest, HttpResponse.BodyHandler.asString());

            while (!httpResponseCompletableFuture.isDone()) {
                out.println("Waiting while request is completed...");
                Thread.sleep(400);
            }

            out.println("httpResponse.statusCode() = " + httpResponseCompletableFuture.get().statusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int order() {
        return 5;
    }
}
