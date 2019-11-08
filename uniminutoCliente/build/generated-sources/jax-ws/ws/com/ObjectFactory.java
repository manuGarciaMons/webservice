
package ws.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.com package. 
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

    private final static QName _AreaResponse_QNAME = new QName("http://ws.com/", "AreaResponse");
    private final static QName _TrianguloResponse_QNAME = new QName("http://ws.com/", "trianguloResponse");
    private final static QName _Area_QNAME = new QName("http://ws.com/", "Area");
    private final static QName _Triangulo_QNAME = new QName("http://ws.com/", "triangulo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrianguloResponse }
     * 
     */
    public TrianguloResponse createTrianguloResponse() {
        return new TrianguloResponse();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link Triangulo }
     * 
     */
    public Triangulo createTriangulo() {
        return new Triangulo();
    }

    /**
     * Create an instance of {@link AreaResponse }
     * 
     */
    public AreaResponse createAreaResponse() {
        return new AreaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "AreaResponse")
    public JAXBElement<AreaResponse> createAreaResponse(AreaResponse value) {
        return new JAXBElement<AreaResponse>(_AreaResponse_QNAME, AreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "trianguloResponse")
    public JAXBElement<TrianguloResponse> createTrianguloResponse(TrianguloResponse value) {
        return new JAXBElement<TrianguloResponse>(_TrianguloResponse_QNAME, TrianguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Area }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "Area")
    public JAXBElement<Area> createArea(Area value) {
        return new JAXBElement<Area>(_Area_QNAME, Area.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Triangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "triangulo")
    public JAXBElement<Triangulo> createTriangulo(Triangulo value) {
        return new JAXBElement<Triangulo>(_Triangulo_QNAME, Triangulo.class, null, value);
    }

}
