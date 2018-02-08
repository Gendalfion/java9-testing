import org.aamvrosov.java9.common.Java9ExampleProvider;
import org.aamvrosov.java9.fabrics.Java9FabricMethodsPresentation;

module org.aamvrosov.java9.fabrics {
    requires org.aamvrosov.java9.common;

    provides Java9ExampleProvider with Java9FabricMethodsPresentation;
}