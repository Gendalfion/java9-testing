import org.aamvrosov.java9.common.Java9ExampleProvider;

module org.aamvrosov.java9.fabrics {
    requires org.aamvrosov.java9.common;

    provides Java9ExampleProvider with org.aamvrosov.java9.fabrics.Java9FabricMethodsPresentation;
}