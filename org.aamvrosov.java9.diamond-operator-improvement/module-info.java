import org.aamvrosov.java9.common.Java9ExampleProvider;
import org.aamvrosov.java9.diamond.operator.improvement.Java9DiamondOperatorPresentation;

module org.aamvrosov.java9.diamond.operator.improvement {
    requires org.aamvrosov.java9.common;

    provides Java9ExampleProvider with Java9DiamondOperatorPresentation;
}