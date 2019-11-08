
package ws.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Area complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="radio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "radio"
})
public class Area {

    protected Double radio;

    /**
     * Obtiene el valor de la propiedad radio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * Define el valor de la propiedad radio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadio(Double value) {
        this.radio = value;
    }

}
