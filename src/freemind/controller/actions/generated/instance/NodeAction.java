//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance;


/**
 * Java content class for node_action complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="node_action">
 *   &lt;complexContent>
 *     &lt;extension base="{}xml_action">
 *       &lt;attribute name="node" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NodeAction
    extends freemind.controller.actions.generated.instance.XmlAction
{


    /**
     * 
     * @return possible object is
     * {@link java.lang.String}
     */
    java.lang.String getNode();

    /**
     * 
     * @param value allowed object is
     * {@link java.lang.String}
     */
    void setNode(java.lang.String value);

}
