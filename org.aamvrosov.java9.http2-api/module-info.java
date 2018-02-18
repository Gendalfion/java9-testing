import org.aamvrosov.java9.common.Java9ExampleProvider;
import org.aamvrosov.java9.http2.api.Java9Http2ApiPresentation;

module org.aamvrosov.java9.http2.api {
    requires org.aamvrosov.java9.common;

    // HTTP client API is not released in Java 9 and provided only as an incubator module
    requires jdk.incubator.httpclient;

    provides Java9ExampleProvider with Java9Http2ApiPresentation;
}