import org.aamvrosov.java9.common.Java9ExampleProvider;
import org.aamvrosov.java9.optional.Java9OptionalPresentation;

module org.aamvrosov.java9.optional {
    requires org.aamvrosov.java9.common;

    provides Java9ExampleProvider with Java9OptionalPresentation;
}