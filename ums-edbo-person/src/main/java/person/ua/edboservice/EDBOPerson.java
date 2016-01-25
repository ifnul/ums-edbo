package ua.edboservice;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2016-01-25T18:10:03.588+02:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "EDBOPerson", 
                  wsdlLocation = "/Users/ivanursul/git/ums-edbo/ums-edbo-person/src/main/resources/wsdl/EDBOPerson.wsdl",
                  targetNamespace = "http://edboservice.ua/") 
public class EDBOPerson extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://edboservice.ua/", "EDBOPerson");
    public final static QName EDBOPersonSoap = new QName("http://edboservice.ua/", "EDBOPersonSoap");
    static {
        URL url = EDBOPerson.class.getResource("/Users/ivanursul/git/ums-edbo/ums-edbo-person/src/main/resources/wsdl/EDBOPerson.wsdl");
        if (url == null) {
            url = EDBOPerson.class.getClassLoader().getResource("/Users/ivanursul/git/ums-edbo/ums-edbo-person/src/main/resources/wsdl/EDBOPerson.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(EDBOPerson.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/Users/ivanursul/git/ums-edbo/ums-edbo-person/src/main/resources/wsdl/EDBOPerson.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public EDBOPerson(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EDBOPerson(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EDBOPerson() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EDBOPerson(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EDBOPerson(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EDBOPerson(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns EDBOPersonSoap
     */
    @WebEndpoint(name = "EDBOPersonSoap")
    public EDBOPersonSoap getEDBOPersonSoap() {
        return super.getPort(EDBOPersonSoap, EDBOPersonSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EDBOPersonSoap
     */
    @WebEndpoint(name = "EDBOPersonSoap")
    public EDBOPersonSoap getEDBOPersonSoap(WebServiceFeature... features) {
        return super.getPort(EDBOPersonSoap, EDBOPersonSoap.class, features);
    }

}
