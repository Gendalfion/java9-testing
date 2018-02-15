import org.aamvrosov.java9.common.Java9ExampleProvider;
import org.aamvrosov.java9.stream.api.improvements.Java9StreamImprovementsPresentation;

module org.aamvrosov.java9.stream.api.improvements {
    requires org.aamvrosov.java9.common;

    provides Java9ExampleProvider with Java9StreamImprovementsPresentation;
}