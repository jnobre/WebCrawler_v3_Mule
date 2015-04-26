
package addMovie;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AddMovieService", targetNamespace = "http://soapservice/", wsdlLocation = "http://localhost:8081/addMovie?wsdl")
public class AddMovieService
    extends Service
{

    private final static URL ADDMOVIESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(addMovie.AddMovieService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = addMovie.AddMovieService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8081/addMovie?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8081/addMovie?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ADDMOVIESERVICE_WSDL_LOCATION = url;
    }

    public AddMovieService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddMovieService() {
        super(ADDMOVIESERVICE_WSDL_LOCATION, new QName("http://soapservice/", "AddMovieService"));
    }

    /**
     * 
     * @return
     *     returns AddMovie
     */
    @WebEndpoint(name = "AddMoviePort")
    public AddMovie getAddMoviePort() {
        return super.getPort(new QName("http://soapservice/", "AddMoviePort"), AddMovie.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddMovie
     */
    @WebEndpoint(name = "AddMoviePort")
    public AddMovie getAddMoviePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soapservice/", "AddMoviePort"), AddMovie.class, features);
    }

}