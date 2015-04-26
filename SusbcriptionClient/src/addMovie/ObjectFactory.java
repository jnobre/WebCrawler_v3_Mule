
package addMovie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the addMovie package. 
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

    private final static QName _AddMovieResponse_QNAME = new QName("http://soapservice/", "addMovieResponse");
    private final static QName _AddMovie_QNAME = new QName("http://soapservice/", "addMovie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: addMovie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMovie_Type }
     * 
     */
    public AddMovie_Type createAddMovie_Type() {
        return new AddMovie_Type();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapservice/", name = "addMovie")
    public JAXBElement<AddMovie_Type> createAddMovie(AddMovie_Type value) {
        return new JAXBElement<AddMovie_Type>(_AddMovie_QNAME, AddMovie_Type.class, null, value);
    }

}
