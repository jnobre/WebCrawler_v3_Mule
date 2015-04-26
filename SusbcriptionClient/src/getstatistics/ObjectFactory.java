
package getstatistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the getstatistics package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStatistics_QNAME = new QName("http://soapservice/", "getStatistics");
    private final static QName _GetStatisticsResponse_QNAME = new QName("http://soapservice/", "getStatisticsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: getstatistics
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatisticsResponse }
     * 
     */
    public GetStatisticsResponse createGetStatisticsResponse() {
        return new GetStatisticsResponse();
    }

    /**
     * Create an instance of {@link GetStatistics_Type }
     * 
     */
    public GetStatistics_Type createGetStatistics_Type() {
        return new GetStatistics_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatistics_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice/", name = "getStatistics")
    public JAXBElement<GetStatistics_Type> createGetStatistics(GetStatistics_Type value) {
        return new JAXBElement<GetStatistics_Type>(_GetStatistics_QNAME, GetStatistics_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatisticsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice/", name = "getStatisticsResponse")
    public JAXBElement<GetStatisticsResponse> createGetStatisticsResponse(GetStatisticsResponse value) {
        return new JAXBElement<GetStatisticsResponse>(_GetStatisticsResponse_QNAME, GetStatisticsResponse.class, null, value);
    }

}
